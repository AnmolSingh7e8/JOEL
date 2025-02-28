package `ITB 12a Col·leccions (I)`

import java.util.Scanner
import java.util.Stack

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) { //Casos de prova

        val numTasques = scanner.nextInt()
        val prioritatATrobar = scanner.nextInt()
        val pila = Stack<Pair<Int, String>>()


        repeat(numTasques){
            val linia = scanner.nextLine()
            val tasques = linia.split(" ", limit = 2)
            val prioritat = tasques[0].toInt()
            val tasca= tasques[1]
            pila.push(Pair(prioritat, tasca))
        }

        val tasquesOrdenades = pila.toList().sortedBy { it.first }

        println(pila.get(prioritatATrobar))

    }

}