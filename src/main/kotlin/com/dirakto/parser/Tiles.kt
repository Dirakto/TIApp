package com.dirakto.parser

data class Tiles(val base: List<Tile>, val pok: List<Tile>) {
    constructor() : this(emptyList(), emptyList())
}