package `ITB 03 - Condicions compostes`import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ex1 = scanner.nextInt() //Demanem tots els numeros
    val ex2 = scanner.nextInt()
    val ex3 = scanner.nextInt()
    val ex4 = scanner.nextInt()
    //Comrovem si el numeros anteriors son diferents que el d'interes
    if (ex1 != ex4 && ex2 != ex4 && ex3 != ex4) {
        println("SI")
    }
    else {
        println("NO")
    }
}