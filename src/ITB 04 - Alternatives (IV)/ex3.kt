package `ITB 04 - Alternatives (IV)`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val any = scanner.nextInt() // demano el valor de l'any
    val resultat = any / 10 // ho divideixo entre 10 per eliminar el ultim numero
    if (resultat % 10 == 9) { //Si el modul dona 9 es que es de la decada
        println("SI")
    } else {
        println("NO")
    }
}