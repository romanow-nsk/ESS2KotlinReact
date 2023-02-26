package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Meta2SettingRegister{
    var oid:Long=0
    var valid:Boolean=false
    var defValueFormula:String=""
    var minValueFormula:String=""
    var maxValueFormula:String=""
    var remoteEnable:Boolean=false
    var failType:Int=0
    var dataRegNum:Int=0
    var overLimit:Boolean=false
    var defValue:Int=0
    var minValue:Int=0
    var maxValue:Int=0
    var unit:String=""
    var power:Int=0
    var regNum:Int=0
    var format:Int=0
    var type:Int=0
    var snapShot:Boolean=false
    var envVar:String=""
    var DOType:String=""
    var out61850Model:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
