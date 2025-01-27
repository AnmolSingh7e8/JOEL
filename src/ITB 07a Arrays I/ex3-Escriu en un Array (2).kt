package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
    scanner.nextLine()
    val secuencia = Array(numeroN){""} //creo el array per llegir paraules
    repeat(numeroN){ //demano el array
        secuencia[it] = scanner.nextLine()
    }
    val numAccedir = scanner.nextInt() //demano el numero de posicio que imprimira en l'array
    for(i in secuencia){ //recorro totes les posicions de l'array
        println(i)
    }
    println(secuencia[numAccedir])
}