package `ITB 08a Strings (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()
    repeat(numVegades) { //ho repetim amb el repeat
        var frase = scanner.nextLine().replace(" ", "") //demano la frase

        if (frase.length % 2 != 0) { //miro que las frase dividida en 2 tingi els mateixos caracter
            var meitat = frase.length / 2 //agafo la mida de la frase i la divideixo entre 2
            var meitat1 = frase.substring(0, meitat) //fico en cada varable cada una de les meitats
            var meitat2 = frase.substring(meitat+1) //en aquesta meitat li sumo un perque es un cas especial
            if(meitat1.toList().sorted() == meitat2.toList().sorted()){
                println("SI")
            } else {
                println("NO")
            }
        } else {

            var meitat = frase.length / 2 //agafo la mida de la frase i la divideixo entre 2
            var meitat1 = frase.substring(0, meitat) //fico en cada varable cada una de les meitats
            var meitat2 = frase.substring(meitat)

            //converteixo en una llista de caracter les dues meitats
            //les ordeno i les comparo
            if(meitat1.toList().sorted() == meitat2.toList().sorted()){
                println("SI")
            } else {
                println("NO")
            }
        }
    }
}