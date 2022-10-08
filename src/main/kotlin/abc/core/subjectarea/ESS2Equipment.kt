package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2Equipment:Entity{
    var ESS2Architecture:EntityLink<ESS2Architecture> = EntityLink<ESS2Architecture>()
    var multiUnit:Boolean=false
    var logUnits:EntityRefList<ESS2LogUnit> = EntityRefList<ESS2LogUnit>()
    var metaFile:EntityLink<ESS2MetaFile> = EntityLink<ESS2MetaFile>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
