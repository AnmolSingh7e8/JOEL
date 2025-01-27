package `ITB 11 Registres I`

import java.util.*

data class Notes ( //creem la data class on emmagatzemarem el preu i el nom dels productes
    var nom: String, //afegim valors
    var nota1 : Float,
    var nota2: Float,
    var notaFinal: Float
)

fun main (){

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()//fem els casos de prova
    scanner.nextLine()

    val notesTotals = mutableListOf<Notes>()

    for (i in 1..numVegades){ //fem els casos de prova

        val notes = scanner.nextLine().split(" ") //fem els casos de prova
        val nom: String = notes[0]
        val nota1: Float = notes[1].toFloat()
        val nota2: Float = notes[2].toFloat()
        val notaFinal: Float = (nota1*0.4 + nota2*0.6).toFloat()

        notesTotals.add(Notes(nom, nota1, nota2, notaFinal))//ho fiquem en la llista de fora
    }

    val p1 = scanner.nextInt() - 1 //demanem les posicion que impimirem
    val p2 = scanner.nextInt()

    notesTotals.sortByDescending {it.nota2} //ordenem les notes del 2 parcial de la llista de manera descendent

    //imprimim els nom i les notes
    println("${notesTotals[p1].component1()} ${notesTotals[p1].component2()} ${notesTotals[p1].component3()} ${String.format(Locale.UK, "%.2f", notesTotals[p1].component4())}")
    println("${notesTotals[p2].component1()} ${notesTotals[p2].component2()} ${notesTotals[p2].component3()} ${notesTotals[p2].component4()}")

}