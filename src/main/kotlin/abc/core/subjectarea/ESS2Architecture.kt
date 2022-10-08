package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2Architecture:Entity{
    var views:EntityRefList<ESS2View> = EntityRefList<ESS2View>()
    var equipments:EntityRefList<ESS2Equipment> = EntityRefList<ESS2Equipment>()
    var devices:EntityRefList<ESS2Device> = EntityRefList<ESS2Device>()
    var scripts:EntityRefList<ESS2ScriptFile> = EntityRefList<ESS2ScriptFile>()
    var emulators:EntityRefList<ESS2EquipEmulator> = EntityRefList<ESS2EquipEmulator>()
    var envValues:EntityRefList<ESS2EnvValue> = EntityRefList<ESS2EnvValue>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
