package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class PLMConfigValue:Entity{
    var PLMConfig:EntityLink<PLMConfig> = EntityLink<PLMConfig>()
    var regNum:Int=0
    var regValue:Int=0
    constructor() {}
}
