package `ITB 04 - Alternatives (IV)`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val hora = scanner.nextInt() // demano els diferents valors del temps
    val minut = scanner.nextInt()
    val segon = scanner.nextInt()
    //si son mes petits o iguals que els següents numeros imprimeix si i sino no
    if (hora in 0..23 && minut in 0.. 59 && segon in 0.. 59) {
        println("SI")
    } else {
        println("NO")
    }
}