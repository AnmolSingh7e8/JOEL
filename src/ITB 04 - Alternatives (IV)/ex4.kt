package `ITB 04 - Alternatives (IV)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val caracter = scanner.next() // Demano el caracter
    // Amb un when faig les diferents  condicions
    when (caracter) { // Amb un whenles condicions
       in "Q" -> println("Skill 1")
        in "W" -> println("Skill 2")
        in "E" -> println("Skill 3")
        in "R" -> println("Ultimate")
        in "B" -> println("Recall")
        in "D"-> println("Bronzes never use summoners")
        in "F"-> println("Bronzes never use summoners")
        else -> {
            println("Error")
        }
    }
}