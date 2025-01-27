package `ITB 02-a Alternatives (senzill)`import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    if (num1>num2) println(num1-num2)
    else println(num2-num1)
}