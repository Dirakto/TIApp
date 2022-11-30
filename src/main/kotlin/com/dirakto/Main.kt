
import com.dirakto.Galaxy
import com.dirakto.types.Planet
import com.dirakto.types.systems.PlanetarySystem
import java.util.stream.Collectors

fun main(args: Array<String>) {
    println("Hello World!")
    constructGalaxy(args[0].toInt())
}






// formula_for_tile = number_of_planets / 3 + number_of_same_traits / 8 + wormhole?
// formula_for_planet = (influence + resource) / 3 + trait?

// (3 + 3) / 3 = 3 + 1 = 4
// 3 / 3 + 1/4 + 1 = 2.25



fun printPlanetsInfo(planets: List<Planet>) {
    val traitCount = planets.stream().collect(Collectors.groupingBy(Planet::type)).map { Pair(it.key, it.value.size) }
    val resourceCount = planets.fold(0) {acc, planet -> return@fold acc + planet.resource }
    val influenceCount = planets.fold(0) {acc, planet -> return@fold acc + planet.resource }
    val specCount = planets.stream().filter{ it.specialty != null}.collect(Collectors.groupingBy(Planet::specialty)).map { Pair(it.key, it.value.size) }
    println(traitCount)
    println(resourceCount)
    println(influenceCount)
    println(specCount)
}



fun constructGalaxy(numberOfPlayers: Int) {
    println(numberOfPlayers)
    val offset = 0
    val tiles = Galaxy.systems[PlanetarySystem::class]
    println(tiles?.size)
    tiles?.subList(offset, offset+5)?.forEach{ print(" | " + it.score) }
    println()
//    tiles?.subList(offset, offset+5)?.forEach{ println((it as PlanetarySystem).getScoreInfo()) }
    tiles?.subList(offset, offset+5)?.forEach{ (it as PlanetarySystem).planets.forEach{println(it.score.toString() + " " + it)} }

//    val anomalies = Galaxy.systems[AnomalySystem::class]
//    println(anomalies?.size)
//    anomalies?.forEach{ print(" | " + it.score) }
//    println()
//    anomalies?.forEach{ println(it) }
}