package `ITB 10b Llistes (II)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
        var num = scanner.nextLine() //demano la frase

        if (num.length-1 % 2 != 0) { //miro que las frase dividida en 2 tingi els mateixos caracter
            var meitat = num.length / 2 //agafo la mida de la frase i la divideixo entre 2
            var meitat1 = num.substring(0, meitat) //fico en cada varable cada una de les meitats
            var meitat2 = num.substring(meitat + 1) //en aquesta meitat li sumo un perque es un cas especial
            if (meitat1.toList() == meitat2.toList()) {
                println("SI")
            } else {
                println("NO")
            }
        } else {

            var meitat = num.length-1 / 2 //agafo la mida de la frase i la divideixo entre 2
            var meitat1 = num.substring(0, meitat) //fico en cada varable cada una de les meitats
            var meitat2 = num.substring(meitat)

            //converteixo en una llista de caracter les dues meitats
            //les ordeno i les comparo
            if (meitat1.toList() == meitat2.toList()) {
                println("SI")
            } else {
                println("NO")
            }
        }
    }