package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Meta2Implement{
    var oid:Long=0
    var valid:Boolean=false
    var template:String=""
    var shortName:String=""
    var registerBase:Int=0
    var mask:Int=0
    var DOType:String=""
    var out61850Model:Boolean=false
    //var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
