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
            if(i == mediana){
                distanciaMedia = distancia
            }
        }

        val planetaBuscat = planetas.filterValues { it == distanciaMedia }.keys
        println(planetaBuscat.joinToString(" "))
    }
}