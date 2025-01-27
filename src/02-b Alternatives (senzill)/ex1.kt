package `ITB 02-b Alternatives (senzill)`
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    // declaro les variables dels participants en les eleccions
    val jiden = scanner.nextInt()
    val drump = scanner.nextInt()
    val banders = scanner.nextInt()

    if (jiden >= drump && jiden >= banders) { // Faig les difentes condicions per saber qui guanya
        println("Jiden")
    } else if ( drump >= jiden &&  drump >= banders) {
        println("Drump")
    } else {
        println("Banders")
    }
}