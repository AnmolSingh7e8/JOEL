package `ITB 07a Arrays II`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()
    repeat(numVegades){
        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        val secuencia = Array(numeroN){0} //creo el array
        repeat(numeroN){ //demano el array
            secuencia[it] = scanner.nextInt()
        }
        var iguals = false //variable per saber si son igual o no
        //recorro totes les posicions de l'array de 0 a numeroN-1 per que no hi ha res en aquest numero
        for(i in 0 until numeroN-1) {

            if(secuencia[i] == secuencia[i+1]){//condicio per determinar si son iguals
                iguals = true
            }
        }
        if (iguals){ //condicio final per determinar el resultat
            println("SI")
        } else {
            println("NO")
        }
    }
}