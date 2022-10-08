package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class MetaExternalSystem:Entity{
    var versionRegNum:Int=0
    var versionRegValue:Int=0
    var subSystems:EntityRefList<MetaSubSystem> = EntityRefList<MetaSubSystem>()
    var states:EntityRefList<MetaState> = EntityRefList<MetaState>()
    var sources:EntityRefList<MetaDataRegister> = EntityRefList<MetaDataRegister>()
    var settings:EntityRefList<MetaSettingRegister> = EntityRefList<MetaSettingRegister>()
    var bitSets:EntityRefList<MetaBitRegister> = EntityRefList<MetaBitRegister>()
    var command:EntityRefList<MetaCommandRegister> = EntityRefList<MetaCommandRegister>()
    var forms:EntityRefList<MetaGUIForm> = EntityRefList<MetaGUIForm>()
    var configs:EntityRefList<PLMConfig> = EntityRefList<PLMConfig>()
    var fileModule:EntityRefList<MetaFileModule> = EntityRefList<MetaFileModule>()
    var importErrorsCount:Int=0
    var importErrorsString:String=""
    var essHost:EntityRefList<MetaGUIElement> = EntityRefList<MetaGUIElement>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
