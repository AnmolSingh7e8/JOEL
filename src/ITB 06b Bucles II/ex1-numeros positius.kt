package `ITB 06b Bucles II`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //variable per imprimir la sequenecia les vegades que vulgui
    var positius = 0 //comptador de numeros parells
//fem un for per fer la sequencia de numeros
    for(i in 1..numVegades) {
        val num = scanner.nextInt()
        if (num > 0) { //fico que si el numero major de 0 sumi 1 al comptador
            positius++
        }
    }
    println(positius)
}