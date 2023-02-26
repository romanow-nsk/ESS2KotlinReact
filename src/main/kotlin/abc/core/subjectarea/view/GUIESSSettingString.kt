package abc.core.subjectarea.view
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class GUIESSSettingString{
    var oid:Long=0
    var valid:Boolean=false
    var W2:Int=0
    var fieldName:String=""
    var colorYes:Int=0
    var colorNo:Int=0
    var editDisable:Boolean=false
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
