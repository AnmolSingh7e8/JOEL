package `ITB 10b Llistes (II)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) { //repetim el numero de vegades que volguem l'array

        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        val numSabatilles = Array(numeroN){0} //creo el array
        repeat(numeroN){ //demano el array
            numSabatilles[it] = scanner.nextInt()
        }
        val midaPersonal = scanner.nextInt() //varaible per trobar el numero dins del l'array
        val midaAceptable = scanner.nextInt()
        var numSabates = 0
        var midaMax = midaPersonal + midaAceptable //trobem la mida maxima
        val midaMin = midaPersonal - midaAceptable //trobem la mida minima
        for(i in 0 until numeroN) { //recorro totes les posicions de l'array
            //condicio per camviar la variable de mida quan trobem similitut
            if(numSabatilles[i] >= midaMin && numSabatilles[i] <= midaMax) { //trobem les mides compreses entre la maxima i la minima
                numSabates++ //sumem al comptador
            }
        }
        println(numSabates)
    }
}