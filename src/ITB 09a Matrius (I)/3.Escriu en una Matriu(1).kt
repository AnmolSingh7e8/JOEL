package `ITB 09a Matrius (I)`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    //Demanem les files i les columnes de la matriu
    var files = scanner.nextInt()
    var columnes = scanner.nextInt()

    //Definim una llista amb les files y les columnes a dins
    var matriu: MutableList<MutableList<Int>> = mutableListOf()

    for(i in 0 until files){ //afegim files per despres omplirles
        matriu.add(mutableListOf())
    }

    for(i in 0 until files) { //omplim les files
        for(j in 0 until columnes) {
            matriu[i].add(scanner.nextInt())
        }

    }
    val i = scanner.nextInt() //demanem les posicions
    val j = scanner.nextInt()

    for (fila in matriu) { //bucle per imprimir la matriu
        println(fila.joinToString(" "))


    }
    println(matriu[i][j]) //imprimim la posicio
}