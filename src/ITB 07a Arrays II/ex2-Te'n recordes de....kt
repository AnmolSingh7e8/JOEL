package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demano les vegades que es repetira l'array
    repeat(numVegades) { //escrivim les vegades que volguem als arrays
        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        val secuencia = Array(numeroN) { 0 } //creo el array
        repeat(numeroN) { //demano el array
            secuencia[it] = scanner.nextInt()
        }
        val numIndex = scanner.nextInt() //demano el numero de posicio que imprimira en l'array
        println(secuencia[numIndex])
    }
}