package `ITB 09a Matrius (I)`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {

        //Demanem les files i les columnes de la matriu
        var files = scanner.nextInt()
        var columnes = scanner.nextInt()

        //Definim una llista amb les files y les columnes i la omplim
        val matriu = mutableListOf<Int>()
        for (i in 0 until files * columnes) {
            matriu.add(scanner.nextInt())
        }


        var numGran = matriu[0] //demanem les posicions
        var posicioMax = 0

        for(i in 1 until matriu.size) { //trobem la posicio maxima i el valor
            if (matriu[i] > numGran) {
                numGran = matriu[i]
                posicioMax = i
            }
        }
        val filaMax = posicioMax / columnes + 1 //amb aquestes operacions calculem la posicio
        val columnaMax = posicioMax % columnes + 1

        println("$filaMax $columnaMax")
    }
}