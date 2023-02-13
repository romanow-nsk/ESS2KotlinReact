package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class PLMConfig:Entity{
    var author:EntityLink<User> = EntityLink<User>()
    var createDate:OwnDateTime=OwnDateTime()
    var changeDate:OwnDateTime=OwnDateTime()
    var registerValues:ArrayList<PLMConfigValue> = ArrayList<PLMConfigValue>()
    var MetaExternalSystem:EntityLink<MetaExternalSystem> = EntityLink<MetaExternalSystem>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
