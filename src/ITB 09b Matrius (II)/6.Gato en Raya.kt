package `ITB 09a Matrius (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {
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
        var comptador = 0

        for(i in 0 until files){
            for(j in 0 until columnes){ //recorrem la matriu
                if(matriu[i][j] == 1){ //si en trobem en un 1
                    //I despres tenim dos posicions mes en horitzontal i dos 1 mes afegim sumem comptador
                    if((i+2) <= (files-1) && matriu[i+1][j] == 1 && matriu[i+2][j] == 1){
                        matriu[i][j] = 2
                        matriu[i+1][j] = 2
                        matriu[i+1][j] = 2
                        comptador++
                        //si en trobem en un 1
                    //I despres tenim dos posicions mes en vertical i dos 1 mes afegim sumem comptador
                    } else if ((j+2) <= (columnes-1) && matriu[i][j+1] == 1 && matriu[i][j+2] == 1){
                        matriu[i][j] = 2
                        matriu[i][j+1] = 2
                        matriu[i][j+2] = 2
                        comptador++
                        //si en trobem en un 1
                    //I despres tenim dos posicions mes em diagonal i dos 1 mes afegim sumem comptador
                    } else if ((i+2) <= (files-1) && (j+2) <= (columnes-1) && matriu[i+1][j] == 1 && matriu[i+2][j] == 1) {
                        matriu[i][j] = 2
                        matriu[i+1][j+1] = 2
                        matriu[i+2][j+2] = 2
                        comptador++
                    }
                }
            }
        }
        println(comptador)
    }
}