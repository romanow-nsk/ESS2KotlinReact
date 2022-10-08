package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class PLMRegisterValue:Entity{
    var equipName:String=""
    var unit:Int=0
    var regNum:Int=0
    var regValue:Int=0
    constructor() {}
}
