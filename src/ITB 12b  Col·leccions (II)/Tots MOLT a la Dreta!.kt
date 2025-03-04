package `ITB 12b  Col·leccions (II)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {
        val tamanyArray = scanner.nextInt() //demano tamany array
        val array = Array(tamanyArray){scanner.nextInt()} //creo l'array
        val d = scanner.nextInt() //demano el desplaçament

        for (i in 0 until tamanyArray) {
            print("${array[(tamanyArray - d + i) % tamanyArray]} ") //Formula per imprimir posicio correcta
        }
        println()
        }


    }
