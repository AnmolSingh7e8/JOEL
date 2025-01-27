package `ITB 08b Strings (II)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetimos las veces que queramos el programa
    scanner.nextLine()
    repeat(numVegades) { //repito el programa con el repeat
        val numTropes = scanner.nextInt()
        scanner.nextLine()

        //demano el nom de les tropa que es guarda en una variable
        val tropes = scanner.nextLine().split(", ")
        val tropaMosqueperro = mutableListOf<String>() //dos listas nuevas para guardar las diferentes tropas
        val tropaSinMosqueperro = mutableListOf<String>()
        for (tropa in tropes) { //analizo las tropas que hay y las guardo en la lista que toca
            if ("\\bMosqueperro\\b".toRegex() in tropa) { //regex sirve para que no tedecte ningun caracter ni delante ni detras
                tropaMosqueperro.add(tropa)
            } else {
                tropaSinMosqueperro.add(tropa)
            }
        }
        println(tropaMosqueperro) //las muestro por pantalla
        println(tropaSinMosqueperro)
    }
}