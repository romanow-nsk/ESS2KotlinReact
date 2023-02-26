package abc.core.subjectarea.view
import abc.core.subjectarea.Artifact
import abc.core.subjectarea.EntityLink
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Meta2GUIImageScriptLevel{
    var oid:Long=0
    var valid:Boolean=false
    var imageH:Int=0
    var imageW:Int=0
    var picture: EntityLink<Artifact> = EntityLink<Artifact>()
    var alphaProc:Int=0
    var lowLevel:Int=0
    var highLevel:Int=0
    var colorBack:Int=0
    var colorLevel:Int=0
    var scripName:String=""
    var noCalc:Boolean=false
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
