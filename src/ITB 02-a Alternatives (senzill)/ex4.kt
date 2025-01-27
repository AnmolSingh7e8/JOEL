package `ITB 02-a Alternatives (senzill)`import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val valor = scanner.nextInt() // demana valor
    if (valor%2 == 0 && valor%3 == 0 && valor%5 == 0 && valor%7 == 0) println("SI") // compara i imprimeix per pantalla
    else println("NO")
}