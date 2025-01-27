package `ITB 05a Iteratius I`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    //declaro la varaible per els numero de vegades que s'itroduiran numeros
    var numVegades = scanner.nextInt()
//en aquest for faig la seqüecia de numeros i dos variables on es guarden els numeros
    for(i in 1..numVegades) {
        var valor = scanner.nextInt()

        var numParell = 0
        var numSenar = 0

//En aquest for amb la i fent el modul trobem si el nomero es parell o senar
        for (j in 1..valor) {
            if (j % 2 == 0) {
                numParell += j // si es parell sumo a la varible de numParell
            } else {
                numSenar += j //si es senar sumo a la variable de numSenar
            }
        }
        println("PARELLS: $numParell SENARS: $numSenar")
    }
}