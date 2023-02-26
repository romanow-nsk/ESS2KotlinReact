package abc.core.subjectarea.equipment
import abc.core.subjectarea.view.GUICollection
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class GUIForm{
    var oid:Long=0
    var valid:Boolean=false
    var controls:GUICollection= GUICollection()
    var level:Int=0
    var parentName:String=""
    var moduleName:String=""
    var empty:Boolean=false
    var noMenu:Boolean=false
    var formLevel:Int=0
    var elementsCount:Int=0
    var accessLevel:Int=0
    var writeLevel:Int=0
    var backImage:String=""
    var regNum:Int=0
    var regBit:Int=0
    var color:Int=0
    var baseForm:Boolean=false
    var linkForm:Boolean=false
    var baseFormIndex:Int=0
    var buttonSize:Int=0
    var snapShot:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
