package `ITB 09a Matrius (I)`

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

    for(i in 0 until files) { //recorro la matiu
        for (j in 0 until columnes) {
                if (matriu[i][j] == "SPIDERMAN") { //on trobo la paraula spiderman
                    if(i>0) {
                        println(matriu[i - 1][j])//imprimim la classe anterior
                    }
                    else {
                        println("NO") //si no imprimim no
                    }
                }
        }
    }
}