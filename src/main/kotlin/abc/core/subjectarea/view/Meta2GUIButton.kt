package abc.core.subjectarea.view
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Meta2GUIButton{
    var oid:Long=0
    var valid:Boolean=false
    var cmdCode:Int=0
    var type:Int=0
    var x:Int=0
    var y:Int=0
    var dx:Int=0
    var h:Int=0
    var color:Int=0
    var commonColor:Boolean=false
    var fontSize:Int=0
    var stringSize:Int=0
    var bold:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}