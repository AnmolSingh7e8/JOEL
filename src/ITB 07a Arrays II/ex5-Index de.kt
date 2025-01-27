package `ITB- 07a Arrays (II)`

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
        val foli = scanner.nextInt()
        val posicio = secuencia.indexOf(foli) //faig servir el index of per imprimir la posicio del foli
        println(posicio)
    }
}