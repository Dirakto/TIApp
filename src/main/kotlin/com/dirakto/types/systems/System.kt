package com.dirakto.types.systems

import com.dirakto.types.enums.Wormholes

sealed class System(open val id: Int, open val wormhole: Wormholes? = null){
    abstract val score: Double
}
