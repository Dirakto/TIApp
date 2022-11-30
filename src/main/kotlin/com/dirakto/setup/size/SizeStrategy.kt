package com.dirakto.setup.size

interface SizeStrategy {
    // 32 + 1 + 4
    fun getPlanetarySystems(): Int

    fun getNonPlanetarySystems(): Int
}