package `ITB 06a Bucles I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) //declarem els contadors on es sumaran les diferents notes
    var notes = 0
    var mitjana : Float = 0.0f
    var exelents = 0
    var notables = 0
    var be = 0
    var suficients = 0
    var insuficients = 0
    var moltDeficients = 0
    var nota = scanner.nextInt()

    while(nota != -1){ //Faig un while on quan introduim un -1 acaba
        if(nota == 10 || nota == 9) { //Faig les diferents condicions per suma en els diferetns contadors
            exelents++
        } else if (nota == 8 || nota == 7){
            notables++
        } else if (nota == 6){
            be++
        } else if (nota == 5){
            suficients++
        } else if (nota == 4){
            insuficients++
        } else if (nota == 0 || nota == 1 || nota == 2 || nota == 3){
            moltDeficients++
        }
        if (nota in 0..10){
            notes++
            mitjana = mitjana + nota
        }

        nota = scanner.nextInt()
    }
    val mitjana2 = mitjana/notes //faig la mitjana
    println("NOTES: $notes MITJANA: $mitjana2 E: $exelents N: $notables B: $be S: $suficients I: $insuficients MD: $moltDeficients")

}