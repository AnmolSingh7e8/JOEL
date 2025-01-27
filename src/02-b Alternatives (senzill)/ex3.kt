import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt() // declaro les variables
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    if (c > b && b > a) { //comparo si hi ha felicitat o no
        println ("SI")
    } else if (a > b && b > c) {
        println ("NO")
    } else {
        println ("NO")
    }
}