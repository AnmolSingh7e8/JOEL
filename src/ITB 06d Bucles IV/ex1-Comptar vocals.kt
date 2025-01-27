package `ITB 06d Bucles IV`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //variable per imprimir la sequenecia les vegades que vulgui
    scanner.nextLine()
    repeat(numVegades) { //faig un repear amb el numero de vegades que vull repetir les frases
        var vocalA = 0 //faig varaibles per emmagatzemar les vocals
        var vocalE = 0
        var vocalI = 0
        var vocalO = 0
        var vocalU = 0
        val frase = scanner.nextLine().uppercase() //vaig un scanner amb uppercase per a que detecti també lletres majuscules
        for (letra in frase) { //faig un for que es fixa en cada lletra
            when (letra) { //Un when per trobar quin tipus de vocal es
                'A' -> vocalA++
                'E' -> vocalE++
                'I' -> vocalI++
                'O' -> vocalO++
                'U' -> vocalU++
            }
        }
        println("A: $vocalA E: $vocalE I: $vocalI O: $vocalO U: $vocalU") //ho mostro per la pantalla
    }
}