package `ITB 02-a Alternatives (senzill)`import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val carta1 = scanner.nextInt() // demana valor
    val carta2 = scanner.nextInt()
    val carta3 = scanner.nextInt()
    if (carta1 == carta2 || carta2 == carta3 || carta3 == carta1 || (carta1 == carta2 && carta2 == carta3)) println("SI")
    else println("NO")
}