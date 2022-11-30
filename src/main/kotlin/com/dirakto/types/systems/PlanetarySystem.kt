package com.dirakto.types.systems

import com.dirakto.types.Planet
import com.dirakto.types.enums.Wormholes

data class PlanetarySystem(
    override val id: Int,
    val planets: List<Planet>,
    override val wormhole: Wormholes?
) : System(id, wormhole) {
    override val score: Double = let {
        planets.size.toDouble() +
                (wormhole?.let { 1 } ?: 0) +
                planets.fold(.0) { acc, planet -> acc + planet.score }
    }

    fun getScoreInfo(): String {
        val builder = StringBuilder()
        builder.append(planets.size.toDouble()).append(", ")
        builder.append(wormhole?.let { 1 } ?: 0).append(", ")
        builder.append("planets: ")
        planets.forEach{
            builder
                .append(it.score)
        }
        return builder.toString()
    }
}