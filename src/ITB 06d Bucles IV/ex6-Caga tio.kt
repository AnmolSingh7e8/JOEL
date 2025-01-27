package `ITB 06d Bucles IV`
import java.util.*
import kotlin.math.ceil

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demano la paraula

    repeat(numVegades) { //repetim el numero de vegades que volguem
        val generacio = scanner.nextDouble() //demanem la generacio que cantara
        var operacio = ceil(generacio/2)
        //fem una frase on ens ajudem amb el repeat on caga es repeteix dividint generacio entre 2 i restant-li 1
        var frase = "Caga "
        repeat( operacio.toInt()-1){
            frase += "caga"
        }
        frase += "tio!"
        println(frase) //imprimim frase
    }
}