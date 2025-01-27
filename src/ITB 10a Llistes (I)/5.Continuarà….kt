package `ITB 10a Llistes (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demanem el numero de casos
    scanner.nextLine()
    repeat(numVegades) { //repetim els casos de prova

        val paraules = scanner.nextLine().split(" ").toMutableList() //demanem la frase

        for (i in 0 until paraules.size-1) { //recorrem la frase
            if ( paraules[i].length < paraules[i+1].length) { //comparem la mida de les paraules
                paraules [i] += "..." //afegim els punts suspensius
            }
        }
        println(paraules.joinToString(" ")) //ho imprimim com una frase amb el joinToString
    }
}