package com.dirakto.parser

import com.dirakto.types.enums.Anomaly
import com.dirakto.types.enums.Wormholes

data class Tile(val id: Int, val planets: List<Int>, val wormhole: Wormholes?, val anomaly: Anomaly?) {
    constructor() : this(0, emptyList(), null, null)
}