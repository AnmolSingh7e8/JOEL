package `ITB 09c Matrius (III)`

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    val files = scanner.nextInt() //demano les files i les columnes per fer la matriu
    val columnes = scanner.nextInt()
    val travolta = scanner.nextInt()

    val matriu:MutableList<MutableList<Int>> = mutableListOf() //creo la matriu

    for(i in 0 until files){ //fico numeros a la matriu
        val fila:MutableList<Int> = mutableListOf()
        for(j in 0 until columnes){
         fila.add(scanner.nextInt())
        }
        matriu.add(fila)
    }

    var encontrat = false //boolean per si no funciona el condicional
    for(i in 0 until files){
        for(j in 0 until columnes-2){ //mirem les columnes
            if(matriu[i][j] == travolta && matriu[i][j+2] == travolta){ //condicio per trobar el numero
                println(matriu[i][j+1])
                encontrat = true
            }
        }
    }

    if(!encontrat){ //imprimir no si no hi ha un numero entre el de travolta
        println("NO")
    }

}