package `02-b Alternatives (senzill)`

import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt() //declaro les variables
    val b = scanner.nextInt()
    //faig les diferents condicions per calcular el numero contigu
    if (a == b+1) {
        println ("SI")
    } else if (b == a + 1) {
        println ("SI")
    } else {
        println ("NO")
    }
}