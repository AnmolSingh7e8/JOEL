package `ITB 06a Bucles I`
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()
    //
    repeat(numVegades){ //per repetir els numero tantes vegades que vols
        val num = scanner.nextInt()
//fem un for per agafar els numeros anteriros al que hem introduit per trobar els divisors
        for(i in 1..num) { //faig el modul per trobar els divisors
        if (num % i == 0) {
            println(i)
            }
        }
    }
}