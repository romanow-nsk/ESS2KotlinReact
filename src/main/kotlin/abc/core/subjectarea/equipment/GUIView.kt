package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class GUIView{
    var oid:Long=0
    var valid:Boolean=false
    var menuButtonOffColor:Int=0
    var menuButtonOnColor:Int=0
    var backColor:Int=0
    var textColor:Int=0
    var labelBackColor:Int=0
    var xmlType:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
