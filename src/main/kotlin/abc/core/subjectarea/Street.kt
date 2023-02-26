package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class Street{
    var oid:Long=0
    var valid:Boolean=false
    var name:String=""
    var type:Int=0
    var city:EntityLink<City> = EntityLink<City>()
    var location:GPSPoint=GPSPoint()
    constructor() {}
}
