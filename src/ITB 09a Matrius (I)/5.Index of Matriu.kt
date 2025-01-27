package `ITB 09a Matrius (I)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val files = scanner.nextInt()//demanem el numero de files
    val columnes = scanner.nextInt()
    val matriu: MutableList<Int> = mutableListOf() //creo una llista

    for (i in 0 until files * columnes) {//creo la matriu
        matriu.add(scanner.nextInt())
    }

    val num = scanner.nextInt() //demano el numero que volem trobar en la matriu
    val index = matriu.indexOf(num) //faig servir la funcio indexOf en la matriu

    if(index != -1){ //condicio per saber si es troba o no aquest numero
        val fila = index/columnes //dividim la posicio entre el num de columnes
        val columna = index%columnes //fem el modul de la posicio entre les columnes
        println("$fila $columna")
    } else {
        println("-1 -1")
    }
}