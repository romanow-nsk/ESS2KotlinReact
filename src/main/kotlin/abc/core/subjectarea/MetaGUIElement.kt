package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class MetaGUIElement{
    var oid:Long=0
    var valid:Boolean=false
    var MetaGUIForm:EntityLink<MetaGUIForm> = EntityLink<MetaGUIForm>()
    var type:Int=0
    var x:Int=0
    var y:Int=0
    var dx:Int=0
    var h:Int=0
    var regNum:Int=0
    var regNum2:Int=0
    var regNum3:Int=0
    var bitMask:Int=0
    var bitNum:Int=0
    var power:Int=0
    var color:Int=0
    var colorYes:Int=0
    var colorNo:Int=0
    var fontSize:Int=0
    var w2:Int=0
    var size:Int=0
    var step:Int=0
    var formName:String=""
    var formLevel:Int=0
    var clickFormName:String=""
    var count:Int=0
    var groupNum:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
