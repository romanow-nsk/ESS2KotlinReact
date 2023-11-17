package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import abc.core.subjectarea.Artifact
import abc.core.subjectarea.EntityLink

@Serializable
class Meta2DataRegister{
    var oid:Long=0
    var valid:Boolean=false
    var streamType:Int=0
    var asFloat60870:Boolean=false
    var stateMask:Int=0
    var unit:String=""
    var power:Int=0
    var regNum:Int=0
    var format:Int=0
    var type:Int=0
    var snapShot:Boolean=false
    var envVar:String=""
    var valueWord:Int=0
    var valueWordSaved:Int=0
    var IEC60870RegNum:Int=0
    var DOType:String=""
    var out61850Model:Boolean=false
    var in60870Model:Boolean=false
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
