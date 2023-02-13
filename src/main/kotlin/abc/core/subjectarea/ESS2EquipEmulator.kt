package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2EquipEmulator:Entity{
    var ESS2Architecture:EntityLink<ESS2Architecture> = EntityLink<ESS2Architecture>()
    var enable:Boolean=false
    var trace:Boolean=false
    var port:Int=0
    var className:String=""
    var lineName:String=""
    var RTU:Boolean=false
    var baudRate:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
