package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
    val secuencia = Array(numeroN){0} //creo el array
    repeat(numeroN){ //demano el array
        secuencia[it] = scanner.nextInt()
    }
    val numAccedir = scanner.nextInt() //demano el numero de posicio que imprimira en l'array
    for(i in secuencia){ //recorro totes les posicions de l'array
        println(secuencia[numAccedir])
    }
}