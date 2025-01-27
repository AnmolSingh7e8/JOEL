package `ITB 06b Bucles II`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) //declarem els contadors on es sumaran les diferents notes
    var numVegades = scanner.nextInt()
    var producte = 0
    var suma = 0
    for (i in 1..numVegades) { //bucle acaba quan ja hagis introduit els numeros que abans has indicat
        val num = scanner.nextInt()
        for (j in 1..num) {
            producte *= j //operacio producte
            suma += j //operacio de suma
        }
        println("SUMA: $suma PRODUCTE: $producte")
    }
}