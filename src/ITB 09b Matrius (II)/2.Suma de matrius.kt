package `ITB 09a Matrius (I)`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val numMatriu = scanner.nextInt()//demanem el numero de files
    val matriu1: MutableList<MutableList<Int>> = mutableListOf() //creo una llista

    for (i in 0 until numMatriu) {//creo la matriu
        val fila: MutableList<Int> = mutableListOf() //creo una llista de files
        for (j in 0 until numMatriu) { //depenent les columnes que tingui afegim valors
            fila.add(scanner.nextInt())
        }
        matriu1.add(fila)
    }

    val matriu2: MutableList<MutableList<Int>> = mutableListOf()//creo la matriu 2
    for(k in 0 until numMatriu){ //creo una llista de files 2
        val fila2: MutableList<Int> = mutableListOf() //depenent les columnes que tingui afegim valors
        for(l in 0 until numMatriu){
            fila2.add(scanner.nextInt())
        }
        matriu2.add(fila2)
    }

    val matriuR: MutableList<MutableList<Int>> = mutableListOf() //creo la matriu per mostrar el resultat

    for(m in 0 until numMatriu){
        val filaR: MutableList<Int> = mutableListOf()//creo una llista de files dels resultats
        for(n in 0 until numMatriu){
            filaR.add(matriu1[m][n] + matriu2[m][n])// faig la suma de les matrius
        }
        matriuR.add(filaR)
    }
    for(m in 0 until numMatriu){ //reorro la matriu per imprimirla
        for(n in 0 until numMatriu){
            print("${matriuR[m][n]} ")
        }
        print("\n") //salt de linia entre els valors
    }

}
