package `ITB 06c Bucles III`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //variable per imprimir la sequenecia les vegades que vulgui
//fem un for per fer la sequencia de numeros
    repeat(numVegades) { //Repetim el numero de vegades que volguem
        var numCartas = scanner.nextInt() //Numero total de cartas
        var alcada = 0 //Alçada formada amb el numero de cartas
        var cartaSobrada = 0 //Cartes que sobren
        var cartesNecesaries = 2
        while(numCartas >= cartesNecesaries) {
            alcada++ //suma de l'alçada principal
            numCartas -= cartesNecesaries  //restem l'alçada en la que estem
            cartesNecesaries += 3 //com que cada alçada van sumant 3 cartes, sumen 3
        }
        //les cartes sobrades es el num de cartes perque es el que queda despres de restar tot en el bucle
        println("$alcada $numCartas")
    }
}