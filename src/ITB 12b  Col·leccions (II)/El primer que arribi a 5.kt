package `ITB 12b  Col·leccions (II)`

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    val noms = mutableListOf<String>()

    var nom = scanner.nextLine()
    while (nom != "xxx") { //Afegim noms fins que es digui xxx
        noms.add(nom)
        nom = scanner.nextLine()
    }

    var guanyador = "NO"

    for (nom in noms) {
        if (guanyador == "NO" && noms.count { it == nom } == 5) { //trobem si algu ha guanyat mes de 5 vegades
            guanyador = nom //cambiem la variable al guanyador
        }
    }

    println(guanyador)

}