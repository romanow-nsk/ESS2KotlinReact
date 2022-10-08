package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ESSNode:Entity{
    var hostName:String=""
    var serverIP:String=""
    var serverPort:Int=0
    var innerIP:String=""
    var innerPort:Int=0
    var working:Boolean=false
    var innerWorking:Boolean=false
    var connect:Boolean=false
    var innerTestTime:OwnDateTime=OwnDateTime()
    var stateTestTime:OwnDateTime=OwnDateTime()
    var streamDataTime:OwnDateTime=OwnDateTime()
    var streamRegisters:EntityRefList<MetaDataRegister> = EntityRefList<MetaDataRegister>()
    var streamRegistersValid:Boolean=false
    var lastStreamDataId:Long=0
    var lastStreamPeriodId:Long=0
    var essConfigName:String=""
    constructor() {}
}
