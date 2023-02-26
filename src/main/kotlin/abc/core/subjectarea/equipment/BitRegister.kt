package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class BitRegister{
    var oid:Long=0
    var valid:Boolean=false
    var bitRegType:Int=0
    var homogen:Boolean=false
    var inline61860:Boolean=false
    var control:Boolean=false
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