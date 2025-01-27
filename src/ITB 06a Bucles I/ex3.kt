package `ITB 06a Bucles I`
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var numVegades = scanner.nextInt() //Aquesta variable indica el numero de vegades que es contarà a torre
    repeat (numVegades){ //amb el repeat es repteix el num de vegades
        val num = scanner.nextInt() //demano un numero per fer la operacio
        var suma = 0 //en aquesta varaible es sumara el resultat
        for(i in 1.. num){ //amb aquestr for farem la secuencia per sumarla graices a la i
            suma = suma+(i*i) //operacio de la torre
        }
        println(suma)
    }
}