package `ITB 07c Arrays III`

import  java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {
        val numeroN = scanner.nextInt() // Llegeix el nombre d'alumnes
        val alcades = IntArray(numeroN) // Crea un array per les alçades

        var mesAlt = Int.MIN_VALUE // Variable per l'alçada més alta
        var mesBaix = Int.MAX_VALUE // Variable per l'alçada més baixa

        // Llegeix les alçades i determina la més alta i la més baixa
        for (i in 0 until numeroN) {
            alcades[i] = scanner.nextInt() // Llegeix l'alçada
            if (alcades[i] < mesBaix) {
                mesBaix = alcades[i] // Troba l'alçada més baixa
            }
            if (alcades[i] > mesAlt) {
                mesAlt = alcades[i] // Troba l'alçada més alta
            }
        }

        // Imprimeix la diferència d'alçada
        println(mesAlt - mesBaix)
    }
}
