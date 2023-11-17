package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import abc.core.subjectarea.Artifact
import abc.core.subjectarea.EntityLink

@Serializable
class ESS2Device{
    var oid:Long=0
    var valid:Boolean=false
    var ESS2Architecture:EntityLink<ESS2Architecture> = EntityLink<ESS2Architecture>()
    var IP:String=""
    var port:Int=0
    var dbEmulator:Boolean=false
    var timeOut:Int=0
    var regsInBlock:Int=0
    var unitsNum:Int=0
    var RTU:Boolean=false
    var baudRate:Int=0
    var trace:Boolean=false
    var uniqueModule:Boolean=false
    var uniqueModuleClass:String=""
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
