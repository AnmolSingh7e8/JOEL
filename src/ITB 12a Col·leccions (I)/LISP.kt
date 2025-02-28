package `ITB 12a Col·leccions (I)`
import java.util.Scanner
import java.util.Stack

fun main() {
    val scanner = Scanner(System.`in`)

    // Llegim el número de casos de prova
    val numVegades = scanner.nextInt()
    scanner.nextLine() // Consumim el salt de línia pendent

    // Repetim el procés per a cada cas de prova
    repeat(numVegades) {
        val secuencia = scanner.nextLine() // Llegim la seqüència actual
        val pila = Stack<Char>() // Creem una pila per als parèntesis
        var esValid = true // Variable que indica si la seqüència és vàlida

        // Recorrem cada caràcter de la seqüència
        for (i in secuencia) {
            when (i) {
                '(' -> pila.push('(') // Si és un parèntesi d'obertura, l'afegim a la pila
                ')' -> {
                    // Si és un parèntesi de tancament:
                    if (pila.isEmpty()) {
                        // Si no hi ha cap '(' per tancar, la seqüència és invàlida
                        esValid = false
                    } else {
                        // Si hi ha un '(' disponible, l'eliminem (desapilem)
                        pila.pop()
                    }
                }
            }
        }

        // La seqüència és vàlida si no hi ha hagut errors i la pila està buida (tots els '(' estan tancats)
        if (esValid && pila.isEmpty()) {
            println("si")
        } else {
            println("no")
        }
    }
}
