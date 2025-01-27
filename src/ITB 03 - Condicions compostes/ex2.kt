package `ITB 03 - Condicions compostes`import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) //Demano les tres cartes
    val carta1 = scanner.nextInt()
    val carta2 = scanner.nextInt()
    val carta3 = scanner.nextInt()
    if (carta1 == carta2 && carta3 == carta1) { //Si les tres cartes son iguals imprimeix si i sino imprimeix no
        println("SI")
    }
    else {
        println("NO")
    }
}