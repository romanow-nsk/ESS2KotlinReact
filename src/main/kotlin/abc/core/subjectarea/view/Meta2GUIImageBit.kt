package abc.core.subjectarea.view
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import abc.core.subjectarea.Artifact
import abc.core.subjectarea.EntityLink

@Serializable
class Meta2GUIImageBit{
    var oid:Long=0
    var valid:Boolean=false
    var imageH:Int=0
    var imageW:Int=0
    var pictureFor0:EntityLink<Artifact> = EntityLink<Artifact>()
    var pictureFor1:EntityLink<Artifact> = EntityLink<Artifact>()
    var bitNum:Int=0
    var colorYes:Int=0
    var colorNo:Int=0
    var buttonSize:Int=0
    var remoteEnable:Boolean=false
    var mixedRegister:Boolean=false
    var failMode:Boolean=false
    var twoUnits:Boolean=false
    var disableIndexOut:Int=0
    var disableIndexIn:Int=0
    var W2:Int=0
    var intValue:Boolean=false
    var byteSize:Boolean=false
    var afterPoint:Int=0
    var type:Int=0
    var x:Int=0
    var y:Int=0
    var dx:Int=0
    var h:Int=0
    var fontSize:Int=0
    var color:Int=0
    var commonColor:Boolean=false
    var backColor:Boolean=false
    var onCenter:Boolean=false
    var bold:Boolean=false
    var labelColor:Int=0
    var labelCommonColor:Boolean=false
    var labelBold:Boolean=false
    var labelOnCenter:Boolean=false
    var labelOnRight:Boolean=false
    var labelBackColor:Boolean=false
    var noEditThere:Boolean=false
    var stringSize:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
