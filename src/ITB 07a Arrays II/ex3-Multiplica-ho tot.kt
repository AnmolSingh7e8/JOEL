package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //numero de vegades que es repeteix l'array
    repeat(numVegades) {
        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        scanner.nextLine()
        val secuencia = Array(numeroN) { 0 } //creo el array per llegir paraules
        repeat(numeroN) { //demano el array
            secuencia[it] = scanner.nextInt()
        }
        val numMultiplica = scanner.nextInt() //demano el numero de posicio que imprimira en l'array
        var opreacio = 0
        for (i in secuencia) { //recorro totes les posicions de l'array i les multiplico pel numMultiplica
            println(i * numMultiplica)
        }
    }
}