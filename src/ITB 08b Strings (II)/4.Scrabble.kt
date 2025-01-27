package `ITB- 08a Strings (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi

    repeat(numVegades) { //ho repetim amb el repeat
        val abecedari: MutableList<Int> = mutableListOf()
        repeat(26) {
            val numAbc = scanner.nextInt()
            abecedari.add(numAbc)
        }
        scanner.nextLine()

        var paraulesCreades = ""
        var comptador = 0
        val paraules = scanner.nextLine().lowercase().split("")
        var noSePuede = false


        for (paraula in paraules) {

            var abecedari2 = abecedari.toMutableList()

            for (letra in paraula) {

                if (abecedari2[letra.code - 97] != 0) {
                    abecedari2[letra.code - 97]--
                    paraulesCreades += paraula

                } else {
                    noSePuede = true

                }

            }
            if (noSePuede == false) {
                comptador++
            }

        }
        println("$comptador $paraulesCreades")
    }
}