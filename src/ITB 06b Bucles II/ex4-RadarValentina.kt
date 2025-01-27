package `ITB 06b Bucles II`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //numero de vegades que es repetira les medicions

    repeat(numVegades) { //es repeteix el numero les vegades que tu fiques
        var categoria = "H" //valor inicial de categoria
        for (i in 1..5) { //el bucle acaba quan s'han introduit 5 numeros
            val medicio = scanner.nextInt()
            //condicio per cambiar el valor a la variable de categoria
            if (medicio >= 10000) {
                categoria = "M"
            } else if (medicio >= 1000 && categoria != "M") {
                categoria = "B"
            }
        }
        println(categoria)
    }
}