package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class StreamDataValue{
    var setOid:Long=0
    var timeStamp:Long=0
    var value:Double=0.0
    constructor() {}
}
