package com.dirakto.types.systems

import com.dirakto.types.enums.Anomaly
import com.dirakto.types.enums.Wormholes

data class AnomalySystem(
    override val id: Int,
    val type: Anomaly?,
    override val wormhole: Wormholes?
) : System(id, wormhole) {
    constructor(id: Int, type: Anomaly) : this(id, type, null)

    override val score = (type?.value ?: 0.0) + (wormhole?.let { 0.75 } ?: 0.0)
}