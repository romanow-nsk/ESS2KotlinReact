package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ArchStreamDataSet:Entity{
    var nodeOid:Long=0
    var createTime:OwnDateTime=OwnDateTime()
    var streamDataType:Int=0
    var ready:Boolean=false
    var packedValues:String=""
    var size:Int=0
    var compressMode:Int=0
    var sendToHost:Boolean=false
    constructor() {}
}
