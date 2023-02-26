package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Template{
    var oid:Long=0
    var valid:Boolean=false
    var DOType:String=""
    var out61850Model:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
