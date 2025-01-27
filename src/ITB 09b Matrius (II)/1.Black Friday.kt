package `ITB 09a Matrius (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val files = scanner.nextInt()//demanem el numero de files
    val columnes = scanner.nextInt()
    val matriu: MutableList<MutableList<Int>> = mutableListOf() //creo una llista

    for (i in 0 until files) {//creo la matriu
        val fila: MutableList<Int> = mutableListOf() //creo una llista de files
        for (j in 0 until columnes) { //depenent les columnes que tingui afegim valors
            fila.add(scanner.nextInt())
        }
        matriu.add(fila)
    }

    val numMultip = scanner.nextInt() //demano el numero per el cual es multiplicara
    for (i in 0 until files) { //recorro la matriu i la multiplico
        for (j in 0 until columnes) {
            println("${(matriu[i][j]) * numMultip}")
        }
    }
}