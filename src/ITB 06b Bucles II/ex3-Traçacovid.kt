package `ITB 06a Bucles I`
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //numero de vegades que es repetira la prova
    var alarma = false //alarma es igual a false per despres activarla

    repeat(numVegades){ //repetim el bucle el numero de vegades que volem

        val numDies = scanner.nextInt()

        for(i in 1..numDies){ //en aquest for analitzem els dies
            val contagis = scanner.nextInt()

            //condicio per activar la alarma
            if(contagis >= 300) {
                alarma = true
            }

        }
        if(alarma == true){ //condicio per obtenir el resultat
            println("ALARMA")
        } else {
            println("OK")
        }
        alarma = false //fico una alarma igual a flase perque quan acaba el bucle la alarma es true
    }
}