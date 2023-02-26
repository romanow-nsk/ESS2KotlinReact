package abc.core.subjectarea.equipment
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Equipment{
    var oid:Long=0
    var valid:Boolean=false
    var versionRegNum:Int=0
    var versionRegValue:Int=0
    var versionRegName:String=""
    var outsideName:String=""
    var fileName:String=""
    var titleEng:String=""
    var protocolId:Int=0
    var readOnly:Boolean=false
    var registers:Collection=Collection()
    var xmlType:Int=0
    var shortName:String=""
    var title:String=""
    var comment:String=""
    constructor() {}
}
