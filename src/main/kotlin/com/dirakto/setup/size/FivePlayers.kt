package com.dirakto.setup.size

class FivePlayers : SizeStrategy {
    override fun getPlanetarySystems(): Int = 4

    override fun getNonPlanetarySystems(): Int = 2

}