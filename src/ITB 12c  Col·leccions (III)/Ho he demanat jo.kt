package `ITB 12c  Col·leccions (III)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    val numVegades = scanner.nextInt()

    repeat(numVegades) {
        val roba = scanner.nextInt() //demano el numero en el que Dani robara els plats
        scanner.nextLine()
        val aperitius = scanner.nextLine().split(" ").toMutableList() //Hi afegeixo a una llista

        var i = roba - 1 //pocicio plat robat
        while (i < aperitius.size) { //Miro si em trobo en la posicio del plat que robara en Dani
            aperitius.removeAt(i) //elimino el plat robat
            i += roba - 1 //següent plat robat
        }

        println(aperitius.joinToString(" "))
    }
}