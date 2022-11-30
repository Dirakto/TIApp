package com.dirakto.setup.size

class ThreePlayers : SizeStrategy {
    override fun getPlanetarySystems(): Int = 6

    override fun getNonPlanetarySystems(): Int = 2

}