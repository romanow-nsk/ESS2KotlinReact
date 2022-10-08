package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class MetaSettingRegister:Entity{
    var defValueFormula:String=""
    var minValueFormula:String=""
    var maxValueFormula:String=""
    var remoteEnable:Boolean=false
    var unit:String=""
    var power:Int=0
    var failType:Int=0
    var dataRegNum:Int=0
    var overLimit:Boolean=false
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
