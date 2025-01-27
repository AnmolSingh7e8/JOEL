package `ITB 05b Iteratius II`
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var videos = 0
    var contador = 0
    //ho faig un bucle while on acaba quan introduim 3 valors igual a -1
    while(videos < 3) {
        val espect = scanner.nextInt() //per itroduir el num d'espectadors
        if (espect == -1) {
            videos++ //quan els espectadors es igual a -1 vol dir que hi ha un strike
        } else {
            contador++ // sino ha pujat un video
        }
    }
        println(contador)
    }
