package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class WorkSettings:Entity{
    var archiveDepthInDay:Int=0
    var streamDataPeriod:Int=0
    var streamDataLongPeriod:Int=0
    var failureTestPeriod:Int=0
    var GUIrefreshPeriod:Int=0
    var eventTestPeriod:Int=0
    var snapShotPeriod:Int=0
    var maxRegisterAge:Int=0
    var mainServerIP:String=""
    var mainServerPort:Int=0
    var mainServerMode:Boolean=false
    var fileScanPeriod:Int=0
    var mainServerConnectPeriod:Int=0
    var plmConnected:Boolean=false
    var metaSystemId:Long=0
    var waitForMainServer:Boolean=false
    var compressMode:Int=0
    var userSilenceTime:Int=0
    var mainServerPeriod:Int=0
    var MKVersion:String=""
    var dataServerFileDir:String=""
    var dataServerFileDirDefault:Boolean=false
    var convertAtrifact:Boolean=false
    var mailHost:String=""
    var mailBox:String=""
    var mailPass:String=""
    var mailSecur:String=""
    var mailPort:Int=0
    var mailToSend:String=""
    var mailNotifycation:Boolean=false
    var nodeName:String=""
    constructor() {}
}
