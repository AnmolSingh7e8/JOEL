package `ITB 12a Col·leccions (I)`

import java.util.Scanner
import java.util.Stack

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() // Llegeix el nombre de casos de prova
    scanner.nextLine() // Neteja la línia en blanc després del nextInt()

    repeat(numVegades) { // Itera per cada cas de prova

        val numTasques = scanner.nextInt() // Llegeix el nombre de tasques
        val prioritatATrobar = scanner.nextInt() // Llegeix la posició de la tasca que volem trobar
        scanner.nextLine() // Neteja la línia en blanc

        val pila = Stack<Pair<Int, String>>() // Crea una pila per emmagatzemar les tasques amb la seva prioritat

        // Llegeix cada tasca i la guarda a la pila
        repeat(numTasques) {
            val linia = scanner.nextLine() // Llegeix la línia completa
            val tasques = linia.split(" ", limit = 2) // Separa la prioritat i la tasca (només en dos parts)
            val prioritat = tasques[0].toInt() // Converteix la prioritat a un enter
            val tasca = tasques[1] // Guarda el nom de la tasca
            pila.push(Pair(prioritat, tasca)) // Afegeix la tasca i la prioritat a la pila
        }

        // Converteix la pila en una llista i l'ordena per prioritat (de menor a major)
        val tasquesOrdenades = pila.toList().sortedBy { it.first }

        // Mostra el nom de la tasca per posicio i substitueix els guions baixos per espais
        println((tasquesOrdenades[prioritatATrobar - 1].second).replace("_", " "))

    }

}
