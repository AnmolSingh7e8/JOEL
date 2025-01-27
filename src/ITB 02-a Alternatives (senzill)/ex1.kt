package `ITB 02-a Alternatives (senzill)`import java.util.*
fun main() {
    val scanner = Scanner(System.`in`) // demana valor
    val boeJiden = scanner.nextInt()
    val tonalBrump = scanner.nextInt()
    if (boeJiden > tonalBrump) println("Jiden") // compara i imprimeix per pantalla
    if (tonalBrump>boeJiden) println("Drump")
    if (boeJiden==tonalBrump) println("No")
}