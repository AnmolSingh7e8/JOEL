package `ITB 12a Col·leccions (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() // Número de casos de prueba

    repeat(numVegades) {

        val numFila = scanner.nextInt() // Tamaño de la fila (4 a 10)
        val fila: MutableList<Int> = mutableListOf()

        // Leer los números y solo añadir los pares
        repeat(numFila) {
            val num = scanner.nextInt()
            if (num % 2 == 0) {
                fila.add(num)
            }
        }
        scanner.nextLine() // Limpiar el buffer

        val moviment = scanner.nextLine() // Leer el movimiento ("L" o "R")

        // Si el movimiento es "R", invertimos la lista antes de procesarla
        val fila2 = if (moviment == "R") {
            fila.filter { it != 0 }.reversed().toMutableList()
        } else {
            fila.filter { it != 0 }.toMutableList()
        }

        val resultat: MutableList<Int> = mutableListOf()
        var pos = 0

        // Combinar elementos adyacentes si son iguales
        while (pos < fila2.size) {
            if (pos < fila2.size - 1 && fila2[pos] == fila2[pos + 1]) {
                resultat.add(fila2[pos] * 2) // Combinar los dos números
                pos += 2 // Saltar el siguiente número
            } else {
                resultat.add(fila2[pos]) // Agregar el número tal como está
                pos++
            }
        }

        // Rellenar con ceros hasta alcanzar el tamaño original
        while (resultat.size < numFila) {
            resultat.add(0)
        }

        // Si el movimiento es "R", invertir el resultado final
        if (moviment == "R") {
            resultat.reverse()
        }

        println(resultat.joinToString(" "))
    }
}
