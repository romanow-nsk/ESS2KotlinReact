package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Account{
    var oid:Long=0
    var valid:Boolean=false
    var login:String=""
    var loginPhone:Phone=Phone()
    var password:String=""
    constructor() {}
}
