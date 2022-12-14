package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2View:Entity{
    var ESS2Architecture:EntityLink<ESS2Architecture> = EntityLink<ESS2Architecture>()
    var metaFile:EntityLink<ESS2MetaFile> = EntityLink<ESS2MetaFile>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
