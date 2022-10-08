package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ArchESSEvent:Entity{
    var type:Int=0
    var level:Int=0
    var title:String=""
    var comment:String=""
    var arrivalTime:OwnDateTime=OwnDateTime()
    var endTime:OwnDateTime=OwnDateTime()
    var equipName:String=""
    var devName:String=""
    var regNum:Int=0
    var bitNum:Int=0
    var prevValue:Double=0.0
    var value:Double=0.0
    var secondRegNum:Int=0
    var secondRegValue:Double=0.0
    var artifact:EntityLink<Artifact> = EntityLink<Artifact>()
    var user:EntityLink<User> = EntityLink<User>()
    constructor() {}
}
