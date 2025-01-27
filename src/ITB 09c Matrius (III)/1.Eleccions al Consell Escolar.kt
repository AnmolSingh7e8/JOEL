package `ITB 09c Matrius (III)`

import java.util.Scanner

fun main () {
    val scan = Scanner(System.`in`)
    val files = scan.nextInt() //demanem el tamany de la matriu
    val columnes = files

    val matriu: MutableList<MutableList<Char>> = mutableListOf()//creem la matriu

    for ( i in 0 until files){
        val fila = mutableListOf<Char>()
        for( j in 0 until columnes){
            fila.add('.')
        }
        matriu.add(fila)
    }
    for(i in 0 until files){ //recorrem la matriu
        for(j in 0 until columnes){
            if(i == 0 || files-1 == i || j == 0 || columnes-1 == j){ //condicio per cambiar a X en els costats
                matriu[i][j] = 'X'
            }
            if(i == j || files - 1 - i == j){ //condicio per cambiar la diagonal a X
                matriu[i][j] = 'X'
            }
            print(matriu[i][j]) //imprimim la matriu
        }
        print("\n") //la imprimim amb els espais
    }

}