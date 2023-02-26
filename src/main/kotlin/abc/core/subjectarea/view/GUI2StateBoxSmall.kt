package abc.core.subjectarea.view
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class GUI2StateBoxSmall{
    var oid:Long=0
    var valid:Boolean=false
    var bitNum:Int=0
    var colorYes:Int=0
    var colorNo:Int=0
    var buttonSize:Int=0
    var remoteEnable:Boolean=false
    var mixedRegister:Boolean=false
    var failMode:Boolean=false
    var W2:Int=0
    var intValue:Boolean=false
    var byteSize:Boolean=false
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