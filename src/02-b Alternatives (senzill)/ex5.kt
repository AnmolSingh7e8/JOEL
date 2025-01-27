import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt() //eclaro les variables
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val num4 = scanner.nextInt()
    val num5 = scanner.nextInt()

    if (num1 > num2 && num2 < num3 && num3 > num4 && num4 < num5) { //comparo per saber si es repeteix el numero en la següent linia
        println("SI")
    } else if (num1 < num2 && num2 > num3 && num3 < num4 && num4 > num5) {
        println("SI")
    }
    else {
        println("NO")
    }
}