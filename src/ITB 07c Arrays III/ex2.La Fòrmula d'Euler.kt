package `ITB 07c Arrays III`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {

        val numeroE = scanner.nextInt() //demano el numero de numeros que hi hauran en la llista
        val secuencia = mutableListOf<Int>() //creo la llista
        for (i in 0 until numeroE) {
            secuencia.add(scanner.nextInt())
        }
        secuencia.sort()//ordeno la llista

        for (i in 0 until numeroE / 2) { //bucle per fer la suma
            val suma = secuencia[i] + secuencia[numeroE - 1 - i]
            println(suma)
        }
    }
}