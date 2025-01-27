package `ITB 05b Iteratius II`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()//declaro el nombre de vegades que s'escriura
    //en aquest repeat es repeteixen els numeros iguals els que el numVegades
    repeat(numVegades) {
        val num = scanner.nextInt()
        var factorial : Long = 1
        //En aquest for en la i estan tots els numeros anterior que el num i es multiplica per fer le factorial
        for(i in 2..num) {
            factorial = factorial * i
        }
        println(factorial)
    }
}