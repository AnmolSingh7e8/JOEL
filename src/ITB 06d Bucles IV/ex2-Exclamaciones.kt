package `ITB 06d Bucles IV`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var paraula = scanner.nextLine() //demano la paraula

    while(paraula != "FIN"){ //faig un bucle que acaba quan escrius FIN
        var exclamacioOberta = 0 //faig dos variables per comptar el numero d'exclamacions
        var exclamacioTancada = 0

        for(i in paraula){  //faig un for per fixar-me en cada letra de la paraula
            if (i == '!') { //faig una condicio per determinar si hi ha una ! o ¡ o res
                exclamacioOberta++
            } else if (i == '¡') {
                exclamacioTancada++
            }
        }
// si les exclamacions obesrtes son  igual a les tancades imprimim SI
        if (exclamacioOberta == exclamacioTancada) {
            println("SI")
        } else { //si no hi ha imprimim NO
            println("NO")
        }

        paraula = scanner.nextLine() //demano una altre paraula
    }
}
