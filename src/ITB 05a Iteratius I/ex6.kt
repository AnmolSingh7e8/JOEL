package `ITB 05a Iteratius I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
//faig un for que fara que doni un determinat cas de numeros
    val numVegades = scanner.nextInt()
    for (i in 1..numVegades) {
        val valor = scanner.nextInt()
        println(valor -1) //imprimeixo sumant-li un
    }
}
