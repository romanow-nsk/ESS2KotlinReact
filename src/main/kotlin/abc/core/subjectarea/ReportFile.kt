package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ReportFile{
    var oid:Long=0
    var valid:Boolean=false
    var reportHeader:String=""
    var reportType:Int=0
    var archive:Boolean=false
    var artifact:EntityLink<Artifact> = EntityLink<Artifact>()
    constructor() {}
}
