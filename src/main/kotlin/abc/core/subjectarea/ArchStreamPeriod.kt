package abc.core.subjectarea
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
class ArchStreamPeriod:Entity{
    var dataSets:EntityRefList<ArchStreamDataSet> = EntityRefList<ArchStreamDataSet>()
    var startServerTime:OwnDateTime=OwnDateTime()
    var shutDownServerTime:OwnDateTime=OwnDateTime()
    var firstStreamTime:OwnDateTime=OwnDateTime()
    var lastStreamTime:OwnDateTime=OwnDateTime()
    var shutDown:Boolean=false
    var node:EntityLink<ESSNode> = EntityLink<ESSNode>()
    var originalPeriodId:Long=0
    var setCount:Int=0
    var sourceByteSize:Int=0
    var packedByteSize:Int=0
    constructor() {}
}
