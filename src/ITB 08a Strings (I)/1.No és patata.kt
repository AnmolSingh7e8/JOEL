package `ITB 08a Strings (I)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()
    repeat(numVegades) { //ho repetim amb el repeat
        val nom = scanner.nextLine().lowercase() //demanem el nom
        if(nom == "patata"){ //condicio per deteminar si s'ha ficat patata o no
            println("Es Patata")
        } else {
            println("No es patata")
        }
    }
}