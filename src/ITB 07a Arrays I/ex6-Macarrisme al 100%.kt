package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
    val secuencia = Array(numeroN){0.0} //creo el array
    repeat(numeroN){ //demano el array
        secuencia[it] = scanner.nextDouble()
    }
    for(i in secuencia.indices) { //recorro totes les posicions de l'array
        println("${secuencia[i] * 100}%") //imprimim multiplicant per 100 i afegint el %
    }
}