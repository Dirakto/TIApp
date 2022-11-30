package com.dirakto.parser

import com.fasterxml.jackson.databind.ObjectMapper

class Loader {
    companion object {
        fun loadPlanets(): Planets = loadFile("/planets.json")

        fun loadTiles() : Tiles = loadFile("/tiles.json")

        private inline fun <reified T>loadFile(file: String): T {
            val mapper = ObjectMapper()
            val json = object {}.javaClass.getResource(file)?.readText()
            return mapper.readValue(json, T::class.java)
        }
    }
}