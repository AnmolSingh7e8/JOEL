package `ITB 05a Iteratius I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt() //llegeixo el primer numero
    var numGran = Integer.MIN_VALUE
    var numPetit = Integer.MAX_VALUE
    while (num != 0) { //faig servir un do per executar el codi fins un 0
            if (num > numGran) numGran = num //agafo el valor mes gran
            if (num < numPetit) numPetit = num //agafo el valor mes petit
        num = scanner.nextInt()
        }
        if (numGran == Integer.MIN_VALUE && numPetit == Integer.MAX_VALUE) {
            println("No s'ha introduic cap numero vàlid")
        } else {
            println("$numGran $numPetit")
        }
}