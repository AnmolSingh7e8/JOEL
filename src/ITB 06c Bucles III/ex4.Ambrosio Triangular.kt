package `ITB 06c Bucles III`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //variable per imprimir la sequenecia les vegades que vulgui
//fem un for per fer la sequencia de numeros
    repeat(numVegades) { //Repetim el numero de vegades que volguem
        var numBombons = 0
        var numPisos = scanner.nextInt() //pis dels bombons que volem saber
        for (i in 1..numPisos){ //en el primer for
            var bombonesPiso = 0
            for(j in i downTo 1 ){ //en el segon for mirem els numeros de i al 1
                bombonesPiso += j //suma dels bombons de cada pis
            }
            numBombons += bombonesPiso //Sumem els bombons anteriors amb cada pis
        }
        println(numBombons)
    }
}




