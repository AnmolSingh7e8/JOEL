import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val dia = scanner.nextInt() //declaro la variable
    when (dia) { //depenen el dia s'imprimeix el dia corresponent
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
    }
}