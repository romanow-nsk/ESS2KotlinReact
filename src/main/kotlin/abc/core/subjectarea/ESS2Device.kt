package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2Device:Entity{
    var ESS2Architecture:EntityLink<ESS2Architecture> = EntityLink<ESS2Architecture>()
    var IP:String=""
    var port:Int=0
    var dbEmulator:Boolean=false
    var timeOut:Int=0
    var regsInBlock:Int=0
    var unitsNum:Int=0
    var RTU:Boolean=false
    var baudRate:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
