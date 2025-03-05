package `ITB 12c  Col·leccions (III)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val numVegades = scanner.nextInt()

    repeat(numVegades) {
        val mapes = mutableMapOf<String, Int>()
        val numMapes = scanner.nextInt()
        scanner.nextLine()

        repeat(numMapes) {
            val mapa = scanner.nextLine()
            mapes[mapa] = mapes.getOrDefault(mapa, 0) + 1 //Afegeixo un comtador de vots al mapa
        }

        val mapaMesVotat = mapes.maxByOrNull { it.value }?.key //Trobo el maxim vot
        println(mapaMesVotat)
    }


}
