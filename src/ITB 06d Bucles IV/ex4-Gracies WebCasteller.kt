package `ITB 06d Bucles IV`

import java.util.*
import kotlin.math.roundToInt

fun main() {
    val scanner = Scanner(System.`in`)
    var numVegades = scanner.nextInt() //demano la paraula

    repeat(numVegades) { //repetim el numero de vegades que volguem

        val paraula1 = scanner.next() //demanem les dues paraules
        val paraula2 = scanner.next()
        var paraulaCurta = paraula1 //anomenem les praules si son curtes o llarges
        var paraulaLlarga =  paraula2

        if(paraula1.length-1 > paraula2.length-1){ //canviem la variable si l'altre paraula es curta o llarga
            paraulaCurta = paraula2
            paraulaLlarga = paraula1
        }
        var comptador = 0 //
        for (i in 0 .. paraulaCurta.length-1) {
            if (paraula1[i] == paraula2[i]){
                comptador++
            }
            var resultado = (paraulaLlarga.length).toDouble()/2
            if ((comptador)>=resultado.roundToInt()){
                println("GRACIES WEBCASTELLER")
            }
            else{
                println("WEBCASTELLER ESTA TRAVIESO HOY")
            }
        }
        var resultat = paraulaLlarga.length /2
    }
}