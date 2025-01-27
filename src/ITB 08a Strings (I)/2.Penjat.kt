package `ITB 08a Strings (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()
    repeat(numVegades) { //ho repetim amb el repeat
        val paraula = scanner.nextLine()
        val intents: List<String> = scanner.nextLine().split(" ") //faig una llista per demanar el intents
        var errors = 0 //per comptar els erros
        val paraulaAmagada = CharArray(paraula.length){'*'} //faig un  array de * per depres substituir-lo per les lletres
        for (i in 0 until intents.size){ //analitzem cada lletra de la llista intents
            var esta = false
            for(j in 0 until paraula.length){ //mirem cada una de les lletres de la paraula
                if(paraula[j].toString() == intents[i]){ // substituim en l'array de *
                    paraulaAmagada[j] = intents[i][0] //
                    esta = true //fiquem true perque esta
                }
            }
            if(!esta){ // condicio final pels errors
                errors++
            }
        }
        println(String(paraulaAmagada) + " $errors")
    }
}
