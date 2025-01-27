package `ITB 06d Bucles IV`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var paraula = scanner.nextLine() //demano la paraula
    var vocalA = false //varaibles amb booleans per veure si estan totes les vocal o no
    var vocalE = false
    var vocalI = false
    var vocalO = false
    var vocalU = false
    for (i in paraula) { //faig un for per analitzar totes les letres
        when (i) { //un when per comprobar si esta la vocal o no a la paraula
            'a' -> vocalA = true
            'e' -> vocalE = true
            'i' -> vocalI = true
            'o' -> vocalO = true
            'u' -> vocalU = true
        }
    } //si totes les variables de les vocals son true imprimeix TOTES i sino imprimeix FALTEN
    if (vocalA == true && vocalE == true && vocalI == true && vocalO == true && vocalU == true) {
        println("TOTES")
    } else {
        println("FALTEN")
    }
}