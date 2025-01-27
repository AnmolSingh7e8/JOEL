package `ITB 05a Iteratius I`
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    //afegeixo tres variables a les que lis sumara el resultat de les notes
    var nota : Int = 0
    var notesTotal= 0
    var nota10 = 0
//Faig un contador on cada vegada que una nota es igual a 10 es suma en la variable o sino es igual a 10 es suma en l'altre
    while (nota != -1){
        nota = scanner.nextInt()
        if(nota == 10) {
            nota10++
            notesTotal++
        }
        else if (nota in 0..10) {
            notesTotal++
        }
    }
    println("TOTAL NOTES: $notesTotal  NOTES10: $nota10") //Mostro per pantalla el resultat
}