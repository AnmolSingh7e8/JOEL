package `ITB 12a Col·leccions (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() // Nombre de casos de prova
    scanner.nextLine() // Neteja la línia en blanc

    repeat(numVegades) { // Bucle per a cada cas de prova
        val numNens = scanner.nextInt() // Nombre de nens inicials
        scanner.nextLine() // Neteja la línia en blanc

        val events = scanner.nextLine() // Seqüència d'esdeveniments
        val cua: Queue<Int> = LinkedList() // Cua per als nens

        for (i in 1..numNens) { // Omple la cua amb els nens
            cua.add(i)
        }

        var ultimNen = numNens // Últim número de nen

        for (event in events) { // Processa els esdeveniments
            when (event) {
                'S' -> cua.poll() // Treu el primer nen
                'N' -> {
                    val nen = cua.poll() // Treu el primer nen
                    cua.add(nen) // El torna a posar
                }
                'E' -> {
                    ultimNen++ // Incrementa el número del nou nen
                    cua.add(ultimNen) // Afegeix el nou nen
                }
            }
        }

        println(cua.peek()) // Mostra el primer nen de la cua
    }
}
