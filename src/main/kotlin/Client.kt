import abc.core.subjectarea.ESS2Architecture
import abc.core.subjectarea.RestAPIBase
import abc.core.subjectarea.User
import kotlinx.browser.document
import kotlinx.browser.window
import react.create
import react.dom.client.createRoot
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.w3c.fetch.Headers
import org.w3c.fetch.RequestInit

suspend fun keepAlive2(token:String): String {
    val response = window
        .fetch("http://localhost:4569/api/keepalive", RequestInit("get", Headers().append("SessionToken",token)))
        .await()
        .text()
        .await()
    return response
}
var token:String=""
suspend fun main(args: Array<String>) {
    val container = document.createElement("div")
    document.body!!.appendChild(container)
    val api: RestAPIBase = RestAPIBase()
    //api.ip="217.71.138.9"
    api.ip="localhost"
    api.port=4569
    val ss = api.keepalive("1111111")
    val userPair = api.login("9130000000","pi31415926")
    var out = ""
    if (!userPair.valid())
        out = userPair.mes
    else {
        var out = ""
        if (!userPair.valid())
            out = userPair.mes
        else {
            token = userPair.data!!.sessionToken
            val format = Json { ignoreUnknownKeys = true }
            var list = api.getEntityList(token,"User",0,0)
            for (vv in list.data!!){
                var user2 = format.decodeFromString<User>(vv.jsonObject)
                out += user2.lastName+"_"+user2.firstName+" "
                }
            var list2 = api.getEntityList(token,"ESS2Architecture",0,0)
            var arch : ESS2Architecture = ESS2Architecture()
            for (vv in list2.data!!){
                arch = format.decodeFromString<ESS2Architecture>(vv.jsonObject)
                out += "ArchId="+arch.oid+"\n"
                }
            //var dd = api.getEntity(token,"ESS2Architecture",arch.oid,4)
            //out+=dd.data!!.jsonObject+"\n"
            //var archFull = format.decodeFromString<ESS2Architecture>(dd.data!!.jsonObject)
            /*
            for (vv in archFull.equipments){
                out+= "1. "+vv.title+"\n"
                }
            for (vv in archFull.devices){
                out+= "2. "+vv.toString()+"\n"
                }
            for (vv in archFull.emulators){
                out+= "3. "+vv.toString()+"\n"
                }
            for (vv in archFull.envValues){
                out+= "4. "+vv.toString()+"\n"
                }
            for (vv in archFull.views){
                out+= "5. "+vv.toString()+"\n"
                }
             */
            }

        //val list = api.getEntityList(token,"User",0,0)
        //val format = Json { ignoreUnknownKeys = true }
        //for (vv in list.data!!){
        //    var user2 = format.decodeFromString<User>(vv.jsonObject)
        //    out += user2.lastName+"_"+user2.firstName+" "
        //    }
        }
    val welcome = Welcome.create {
        name = api.ip+" "+token+" "+out

    }
    createRoot(container).render(welcome)
}