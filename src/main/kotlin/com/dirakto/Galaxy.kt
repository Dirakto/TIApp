package com.dirakto

import com.dirakto.parser.Loader
import com.dirakto.types.Planet
import com.dirakto.types.systems.AnomalySystem
import com.dirakto.types.systems.PlanetarySystem
import com.dirakto.types.systems.System
import java.util.stream.Collectors
import kotlin.reflect.KClass

class Galaxy {
    companion object {
        private val planets: List<Planet> = let {
            Loader
                .loadPlanets()
                .base
                .map { Planet(it.id, it.name, it.type, it.resource, it.influence, it.specialty) }
                .sortedBy(Planet::id)
        }

        val systems: Map<KClass<*>, List<System>> = let {
            val (baseTiles, _) = Loader.loadTiles()

            val types = baseTiles
                .stream()
                .collect(Collectors.partitioningBy { it.planets.isEmpty() })

            val anomaly = types[true]?.map { AnomalySystem(it.id, it.anomaly, it.wormhole) } ?: emptyList()
            val systems = types[false]?.map {
                val systemPlanets = it.planets.map { index -> planets[index-1] }
                PlanetarySystem(it.id, systemPlanets, it.wormhole)
            } ?: emptyList()


            mapOf(
                AnomalySystem::class to anomaly,
                PlanetarySystem::class to systems
            )
        }
    }
}