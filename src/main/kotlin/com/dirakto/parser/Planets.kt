package com.dirakto.parser

import com.dirakto.types.Planet

data class Planets(val base: List<Planet>, val pok: List<Planet>) {
    constructor() : this(emptyList(), emptyList())
}