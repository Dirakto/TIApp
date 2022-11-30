package com.dirakto.setup.size

class SixPlayers : SizeStrategy {
    override fun getPlanetarySystems(): Int = 3

    override fun getNonPlanetarySystems(): Int = 2
}