package `ITB 10a Llistes (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demanem el numero de casos
    scanner.nextLine()
    repeat(numVegades) { //repetim els casos de prova

        val listaBlanca = listOf("HollowKnight", "DarkSouls", "Zelda", "Eclipse") //creem la llista blanca
        var nivellShitList = 0
        val sesions = scanner.nextLine().split(" ").toMutableList() //demanem les clases que fa
        val vegMira = scanner.nextInt() //demanem les vegades que mira el profe
        repeat(vegMira){ //ho repetm
            val hora = scanner.nextInt() -15 //determinem la posicio restant 15

            if(!listaBlanca.contains(sesions[hora])){ //si no es igual a algun elemente de la llista blanca
                when(sesions[hora]) { //pasem per les següents condicions
                    "LoL" -> nivellShitList += 2
                    else -> nivellShitList += 1
                }
            }

        }
        println("Nivell de Shitlist: ${nivellShitList}")
        scanner.nextLine() //per escriure en el teclat paraules perque haviem demanant Integers
    }
}