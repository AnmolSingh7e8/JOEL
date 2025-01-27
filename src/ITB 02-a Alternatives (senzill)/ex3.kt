package `ITB 02-a Alternatives (senzill)`import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val any = scanner.nextInt() // demana valor
    when(any) {
        in 1 ..1944 -> println("nah") // compara i imprimeix per pantalla
        in 1945 .. 1965 -> println("ok boomer")
        in 1966 ..2020 -> println("nah")
    }
}