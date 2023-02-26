package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Meta2BitArray{
    var oid:Long=0
    var valid:Boolean=false
    var elem:Meta2Face=Meta2Face()
    var size:Int=0
    var step:Int=0
    var ownBase:Int=0
    var DOType:String=""
    var out61850Model:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
