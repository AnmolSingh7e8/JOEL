package `ITB 09a Matrius (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val files = scanner.nextInt()//demanem el numero de files
    val columnes = scanner.nextInt()
    val matriu: MutableList<MutableList<Int>> = mutableListOf() //creo una llista

    for (i in 0 until files) {//creo la matriu
        val fila: MutableList<Int> = mutableListOf() //creo una llista de files
        for(j in 0 until columnes){ //depenent les columnes que tingui afegim valors
            fila.add(scanner.nextInt())
        }
        matriu.add(fila)
    }

    val numSuma = scanner.nextInt()

    var sumaF = 0
    var sumaC = 0

    // Calculamos la suma de la fila `numSuma`
    for (j in 0 until columnes) {
        sumaF += matriu[numSuma][j]
    }

    // Calculamos la suma de la columna `numSuma`
    for (i in 0 until files) {
        sumaC += matriu[i][numSuma]
    }
    println("$sumaF $sumaC")

}