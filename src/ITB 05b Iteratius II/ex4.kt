package `ITB 05b Iteratius II`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numMillons = scanner.nextInt()
//faig un for que fa que s'imprimeixi tan numeros que li indiques saltant 1000000 vegades
    for(i in 1000000 ..numMillons step 1000000) {
        println(i) //ho imprimeixo
    }
}