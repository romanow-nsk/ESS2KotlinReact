
import abc.core.subjectarea.*
import abc.core.subjectarea.equipment.Meta2XML
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.w3c.fetch.Headers
import org.w3c.fetch.RequestInit
import react.create
import react.dom.client.createRoot



suspend fun keepAlive2(token:String): String {
    val response = window
        .fetch("http://10.200.200.70:4567/api/keepalive", RequestInit("get", Headers().append("SessionToken",token)))
        .await()
        .text()
        .await()
    return response
    }
var token:String=""
val constMap: HashMap<String,ConstValue> = HashMap()
val api : RestAPIBase= RestAPIBase();
val api2 : RestAPIESS2= RestAPIESS2();
//---------------------------------------------------------------------------------------------------------------
fun finalOut(out : String){
    val container = document.createElement("div")
    document.body!!.appendChild(container)
    val welcome = Welcome.create {
        name = out
        }
    createRoot(container).render(welcome)
    }
//-------------------------------------------------------------------------------------------------------------------
suspend fun loadXMLArtifact(art : Artifact) : Meta2XML {
    val body = api.downLoad(token,art.oid)
    if (!body.valid())
        finalOut("Ошибка: "+body.mes)
    else{
        finalOut("Тело: "+body.data)
        }
    return Meta2XML()
    }
    /*
    val fileSize: Long = body.data!!.contentLength()
    val `in`: InputStream = body.byteStream()
    val reader = InputStreamReader(`in`, "UTF8")
    val buffer = StringBuffer()
    var cc: Int
    while (reader.read().also { cc = it } != -1) {
        buffer.append(cc.toChar())
    }
    reader.close()
    base.guiCall(object : Runnable() {
        override fun run() {
            back.onSuccess(buffer.toString())
        }
    })
    */
// поправить - двойной шаблон
// RestAPIESS2
// suspend fun getStreamData2(SessionToken:String,mode:Int,logNum:Int,timeInMS1:Long,timeInMS2:Long) : R<Pair<ErrorList,ArrayList<StreamDataValue>>> {
// RestAPIBase
// suspend fun getConsoleLogPolling(SessionToken:String,lastnum:Long) : R<Pair<Long,StringList>> {
// api2.ip="http://10.200.200.72"
// api2.port=4567
//
suspend fun main(args: Array<String>) {
    api.ip="10.200.200.70"
    api.port=4567
    api2.ip="10.200.200.70"
    api2.port=4567
    val ss = api.keepalive("1111111")
    //------------------------- Авторизация под сисадмином ------------------------
    val userPair = api.login("9131111111","1234")
    var out = ""
    if (!userPair.valid()){
        finalOut("Ошибка: "+userPair.mes)
        return
        }
    token = userPair.data!!.sessionToken
    val format = Json { ignoreUnknownKeys = true }
    //---------------------------------------------------------------
    //var list = api.getEntityList(token,"User",0,0)
    //for (vv in list.data!!){
    //     var user2 = format.decodeFromString<User>(vv.jsonObject)
    //     out += user2.lastName+"_"+user2.firstName+"["+user2.oid+"]..."
    //     }
    val cList =  api.getConstAll(token)
    if (!cList.valid()){
        finalOut("Ошибка: "+cList.mes)
        return
        }
    //---------------------- Таблица констант от сервера ----------------------
    constMap.clear()
    for(cc in cList.data!!){
        constMap.put(cc.groupName+"."+cc.name,cc)
        }
    var twoLong = api2.getArchitectureState(token)
    if (!twoLong.valid()){
        finalOut("Ошибка: "+twoLong.mes)
        return
        }
    val state = twoLong.data!!.get(0)
    if (twoLong.data!!.get(0).toInt()!=constMap.get("ArchState.ASConnected")!!.value){
        finalOut("Недопустимое состояние сервера: "+twoLong.data!!.get(0))
        return
        }
    var dd = api.getEntity(token,"ESS2Architecture",twoLong.data!!.get(1),4)
    if (!dd.valid()){
        finalOut("Ошибка: "+dd.mes)
        return
        }
    var archFull = format.decodeFromString<ESS2Architecture>(dd.data!!.jsonObject)
        for (vv in archFull.equipments){
            val xx = loadXMLArtifact(vv.metaFile.ref!!.file.ref!!)
            out+= "1. "+vv.title+"\n"
            }
        for (vv in archFull.devices){
            out+= "2. "+vv.title+"\n"
            }
        for (vv in archFull.emulators){
            out+= "3. "+vv.title+"\n"
            }
        for (vv in archFull.envValues){
            out+= "4. "+vv.title+"\n"
            }
        for (vv in archFull.views){
            out+= "5. "+vv.title+"\n"
            }
        finalOut(out)
        //val list = api.getEntityList(token,"User",0,0)
        //val format = Json { ignoreUnknownKeys = true }
        //for (vv in list.data!!){
        //    var user2 = format.decodeFromString<User>(vv.jsonObject)
        //    out += user2.lastName+"_"+user2.firstName+" "
        //    }
}