package `ITB 05a Iteratius I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
//faig un repeat que fara que doni un determinat cas de numeros
    val numVegades = scanner.nextInt()
    repeat(numVegades) {
        var valor = scanner.nextInt()
        repeat(valor) {
            println("No ofendre al president patata") //imprimeixo la frase
        }
    }
}