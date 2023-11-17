package abc.core.subjectarea.view
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import abc.core.subjectarea.Artifact
import abc.core.subjectarea.EntityLink

@Serializable
class Meta2GUIImageDataLevel{
    var oid:Long=0
    var valid:Boolean=false
    var imageH:Int=0
    var imageW:Int=0
    var picture:EntityLink<Artifact> = EntityLink<Artifact>()
    var alphaProc:Int=0
    var lowLevel:Double=0.0
    var highLevel:Double=0.0
    var failLevel:Double=0.0
    var warnLevel:Double=0.0
    var formName:String=""
    var ownUnit:Boolean=false
    var unitIdx:Int=0
    var unitLevel:Int=0
    var onlyIndex:Boolean=false
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
