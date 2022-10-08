package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class MetaGUIForm:Entity{
    var childs:EntityLinkList<MetaGUIForm> = EntityLinkList<MetaGUIForm>()
    var controls:EntityRefList<MetaGUIElement> = EntityRefList<MetaGUIElement>()
    var parent:EntityLink<MetaGUIForm> = EntityLink<MetaGUIForm>()
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
    var MetaExternalSystem:EntityLink<MetaExternalSystem> = EntityLink<MetaExternalSystem>()
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
