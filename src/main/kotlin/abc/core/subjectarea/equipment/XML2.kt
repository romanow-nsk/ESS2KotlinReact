package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable

@Serializable
class XML2{
    var oid:Long=0
    var valid:Boolean=false
    var xmlType:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
