package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2Node:Entity{
    var architecture:EntityLink<ESS2Architecture> = EntityLink<ESS2Architecture>()
    var ESSServerIP:String=""
    var ESSServerPort:Int=0
    var enabled:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
