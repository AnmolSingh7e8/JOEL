package `ITB 07c Arrays III`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {

        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        scanner.nextLine()
        val secuencia = Array(numeroN-1) { "" } //creo el array
        var trobat = false //per comprobar si es troba el animal en l'array


        repeat(numeroN-1) { //demano el array
            val animal = scanner.nextLine()
            secuencia[it] = animal
        }

            val animalBuscat = scanner.nextLine() //demanem el ultim animal que es el que estem buscant
            //recorro totes les posicions de l'array

            for (i in 0 until secuencia.size) {
                if (animalBuscat == secuencia[i]) { //condicio on comparem l'ultim element amb els altres
                    trobat = true
                }
            }
        if (trobat) { //imprimim el resultat
            println("SI")
        } else {
            println("NO")
        }
    }
}