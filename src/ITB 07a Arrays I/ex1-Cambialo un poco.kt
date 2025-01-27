package `ITB 07a Arrays I`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) { //repetim el numero de vegades que volguem l'array

        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        val secuencia = Array(numeroN){0} //creo el array
        repeat(numeroN){ //demano el array
            secuencia[it] = scanner.nextInt()
        }
        val numSecuencia = scanner.nextInt() //varaible per trobar el numero dins del l'array
        val numCanvi = scanner.nextInt() //varaibale per prosposar un nou per cambiar-lo
        for(i in secuencia.indices) { //recorro totes les posicions de l'array
            if (secuencia[i] == numSecuencia) { //condicio per canviar el numero en l'array
                secuencia[i] = numCanvi
            }
        }
        println(secuencia.joinToString(" ")) //fem servir el joinToString perque imprimi tota l'array amb el canvi
    }
}