package `ITB 02-a Alternatives (senzill)`import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Pedimos las opciones de los jugadores
    val jugador1 = scanner.nextInt()
    val jugador2 = scanner.nextInt()

    // Comprobamos si las entradas son válidas (1, 2 o 3)
    if (jugador1 !in 1..3 || jugador2 !in 1..3) {
        println("ERROR")
    } else {
        if (jugador1 == jugador2) {
            println("EMPAT")
        }
        else if ((jugador1 == 1 && jugador2 == 3) || // pedra guanya tisora
            (jugador1 == 2 && jugador2 == 1) || // paper guanya pedra
            (jugador1 == 3 && jugador2 == 2)) { // tisora guanya paper
            println("Jugador1")
        }
        // Si no ha ganado jugador1, entonces gana jugador2
        else {
            println("Jugador2")
        }
    }
}