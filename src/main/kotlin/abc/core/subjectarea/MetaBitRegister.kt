package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class MetaBitRegister:Entity{
    var bits:EntityRefList<MetaBit> = EntityRefList<MetaBit>()
    var bitRegType:Int=0
    var homogen:Boolean=false
    var control:Boolean=false
    var step:Int=0
    var count:Int=0
    var count2:Int=0
    var count3:Int=0
    var regNum:Int=0
    var format:Int=0
    var type:Int=0
    var subSystem:EntityLink<MetaSubSystem> = EntityLink<MetaSubSystem>()
    var MetaExternalSystem:EntityLink<MetaExternalSystem> = EntityLink<MetaExternalSystem>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
