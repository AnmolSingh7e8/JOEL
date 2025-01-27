package `ITB 09c Matrius (III)`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val files = scanner.nextInt()//demanem el numero de files
    var matriu: MutableList<MutableList<Int>> = MutableList(files) { MutableList(files) { 0 } } //creo una llista amb tots 0

    for(i in 0 until files){ //cambio en la diagonal la 0 por 1
        matriu[i][i] = 1
    }

    for (i in 0 until files) { //recorro la matiu
        for (j in 0 until files) {
            print(matriu[i][j])
        }
        println()//es imprimeix separat
    }
}