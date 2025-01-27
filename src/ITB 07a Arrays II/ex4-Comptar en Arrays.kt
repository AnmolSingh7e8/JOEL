package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) { //repetim el numero de vegades que volguem l'array

        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        val secuencia = Array(numeroN) { 0 } //creo l'array
        repeat(numeroN) { //demano l'array
            secuencia[it] = scanner.nextInt()
        }
        var posicio = scanner.nextInt()
        var pos = 0 // inicialitzem la variable de la poscicio maxima amb el 0
        for (i in secuencia) { //recorro totes les posicions de l'array
            if (i == posicio) { //condicio on comprovem
                pos++
            }
        }
        println(pos)
    }
}