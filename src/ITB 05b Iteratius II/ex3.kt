package `ITB 05b Iteratius II`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //defineixo el numero de vegades que s'imprimira el codi
    for (i in numVegades downTo 0){  // fico un downto per que ho imprimeixo al reves
        println(i)
    }
}