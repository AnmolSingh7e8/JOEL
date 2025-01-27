package `ITB 10b Llistes (II)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()
    scanner.nextLine()

    repeat(numVegades) { //repetim el numero de vegades que volguem l'array

        val llista = scanner.nextLine().split(" ").toMutableList() //creem una llista
        val nomProhibit = scanner.nextLine() //demanem el nom que volem treure

        val llistaNova = mutableListOf<String>() //creem una llista nova

        for(nom in llista){ //recorrem la llista
            if(nom == nomProhibit) {
                if (!llistaNova.contains(nomProhibit)) { //si la llista nova no conte Homer
                    llistaNova.add(nom)//afegim Homer a la llista nova
                }
            } else { //afegim els altres noms
                llistaNova.add(nom)
            }
        }

        println(llistaNova)
    }
}
