package `ITB 08a Strings (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()
    repeat(numVegades) { //ho repetim amb el repeat
        val frase = scanner.nextLine()
        val paraules = frase.split(" ") //faig una llista per demanar el intents
        var longitudMax = 0
        for(paraula in paraules){ //bucle per determinar la longitud de les paraules
            if(paraula.length > longitudMax){ //condicio per cambiar la longitud
                longitudMax = paraula.length
            }
        }
        println(longitudMax)
    }
}