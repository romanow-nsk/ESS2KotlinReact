package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2MetaFile:Entity{
    var file:EntityLink<Artifact> = EntityLink<Artifact>()
    var metaType:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
