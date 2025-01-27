package `ITB 02-a Alternatives (senzill)`import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val dia = scanner.nextInt()
    if(dia < 1 || dia > 366) {
        println("Incorrecte!")
    } else if (dia == 366) {
        println("Correcte per un any bixest!")
    }else {
        println("Correcte per un any no bixest!")
    }
}