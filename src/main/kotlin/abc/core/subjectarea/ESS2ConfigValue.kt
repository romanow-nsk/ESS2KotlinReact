package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import abc.core.subjectarea.Artifact
import abc.core.subjectarea.EntityLink

@Serializable
class ESS2ConfigValue{
    var oid:Long=0
    var valid:Boolean=false
    var ESS2Config:EntityLink<ESS2Config> = EntityLink<ESS2Config>()
    var devName:String=""
    var logUnit:Int=0
    var regNum:Int=0
    var regValue:Int=0
    constructor() {}
}
