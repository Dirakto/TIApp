package com.dirakto.setup.size

class FourPlayers : SizeStrategy {
    override fun getPlanetarySystems(): Int = 5

    override fun getNonPlanetarySystems(): Int = 3

}