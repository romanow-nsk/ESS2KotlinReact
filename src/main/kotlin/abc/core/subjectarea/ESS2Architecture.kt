package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESS2Architecture{
    var oid:Long=0
    var valid:Boolean=false
    var views:ArrayList<ESS2View> = ArrayList<ESS2View>()
    var equipments:ArrayList<ESS2Equipment> = ArrayList<ESS2Equipment>()
    var devices:ArrayList<ESS2Device> = ArrayList<ESS2Device>()
    var scripts:ArrayList<ESS2ScriptFile> = ArrayList<ESS2ScriptFile>()
    var emulators:ArrayList<ESS2EquipEmulator> = ArrayList<ESS2EquipEmulator>()
    var envValues:ArrayList<ESS2EnvValue> = ArrayList<ESS2EnvValue>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
