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
        var max = Integer.MIN_VALUE //inicialitzem la variable amb el valor mes petit posible
        var posMax = 0 // inicialitzem la variable de la poscicio maxima amb el 0
        for (i in 0 until secuencia.size) { //recorro totes les posicions de l'array
            if (secuencia[i] > max) { //condicio on es suma al el valor mes gran de l'array
                max = secuencia[i]
                posMax = i //canviem la posicio a la següent
            }
        }
        println(posMax+1)
    }
}