package `ITB 05a Iteratius I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var positiu = 0
    var negatiu = 0
    var num = scanner.nextInt() //llegeixo el primer numero
    while (num != 0) { //Miro si el numero no sigui igual a 0
        if (num > 0) {
            positiu++
        } else if (num < 0) {
            negatiu++
        }
        num = scanner.nextInt() //llegueixo el següent número
    }
    if (positiu > negatiu) {//en cas de que llegeixi el 0 imprimeixo el següent per la pantalla
        println("POSITIUS")
    } else if (negatiu > positiu) {
        println("NEGATIUS")
    } else {
        println("IGUALS")
    }
}