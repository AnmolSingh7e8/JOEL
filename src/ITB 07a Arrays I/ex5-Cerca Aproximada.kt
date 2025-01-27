package `ITB 07a Arrays I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) { //repetim el numero de vegades que volguem l'array

        val numeroN = scanner.nextInt() //demano el numero de numeros que hi ha en l'array
        val numSabatilles = Array(numeroN){0} //creo el array
        repeat(numeroN){ //demano el array
            numSabatilles[it] = scanner.nextInt()
        }
        var midaTrobada:Boolean = false //inicialitzem la varaible per trobar la mida
        val midaPersonal = scanner.nextInt() //varaible per trobar el numero dins del l'array
        for(i in numSabatilles.indices) { //recorro totes les posicions de l'array
            //condicio per camviar la variable de mida quan trobem similitut
            if(midaPersonal-1 == numSabatilles[i] || midaPersonal+1 == numSabatilles[i]) {
                midaTrobada = true
            }
        }
        if(midaTrobada == true) { //condicio final per imprimir el resutlat
            println("SI")
        } else {
            println("NO")
        }
    }
}