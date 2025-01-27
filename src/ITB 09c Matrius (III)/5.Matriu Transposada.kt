package `ITB 09c Matrius (III)`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val files = scanner.nextInt()//demanem el numero de files
    val columnes = scanner.nextInt()
    val matriu: MutableList<MutableList<String>> = mutableListOf() //creo una llista

    for (i in 0 until files) {//creo la matriu
        val fila: MutableList<String> = mutableListOf() //creo una llista de files
        for (j in 0 until columnes) { //depenent les columnes que tingui afegim valors
            fila.add(scanner.next())
        }
        matriu.add(fila)
    }

    for (i in 0 until columnes) { //recorro la matiu
        for (j in 0 until files) {
            println(matriu[j][i]) //transposo la matriu
        }
    }
}