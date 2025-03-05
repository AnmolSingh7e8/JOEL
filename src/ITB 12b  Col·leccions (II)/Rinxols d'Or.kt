package `ITB 12b  Col·leccions (II)`

import java.util.LinkedHashMap
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    val numVegades = scanner.nextInt()

    repeat(numVegades){
        val numPlanetas = scanner.nextInt()
        scanner.nextLine()
        val planetas:MutableMap<Pair<String, Double>, Double> = LinkedHashMap()

        val mediana = planetas.size / 2
        var distanciaMedia = 0.0

        for(i in 0 .. planetas.size){
            val entrada = scanner.nextLine().split(" ") // Llegim tota la línia
            val nomPlaneta = entrada[0]
            val distancia = entrada[1].toDouble()
            val massa = entrada[2].toDouble()

            planetas[Pair(nomPlaneta, distancia)] = massa
        }

        val sortedPlanets = planetas.toList().sortedBy { it.first.second }
        val medianDistanceIndex = sortedPlanets.size / 2
        val medianDistance = sortedPlanets[medianDistanceIndex].first.second

        // Filtrar planetas con la distancia mediana
        val planetsWithMedianDistance = sortedPlanets.filter { it.first.second == medianDistance }

        val resultat = if (planetsWithMedianDistance.size == 1) {
            planetsWithMedianDistance[0].first.first
        } else {
            // Ordenar los planetas con la distancia mediana por tamaño y encontrar la mediana
            val sortedBySize = planetsWithMedianDistance.sortedBy { it.second }
            sortedBySize[sortedBySize.size / 2].first.first
        }

        println(resultat)

    }
}