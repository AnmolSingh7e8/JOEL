package `ITB 06c Bucles III`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`) //declarem els contadors on es sumaran les diferents notes
    var numVegades = scanner.nextInt()
    repeat(numVegades){
        var hp = scanner.nextInt() //variable de la vida
        var rammus = scanner.nextInt() //variable atac rammus
        var twitch = scanner.nextInt() //varaible atac twitch
        var atacs = 0 //varaible per emmagatzemar
        var matador = "" //varaible per determinar qui la ha matat
        while(hp > 0){ //en aquest en fixem en la vida
            atacs++ //es suma un atac
            hp -= rammus // restem el atac de rammus
            if (hp <= 0){ // i si la hp es igual a zero el matador es rammus
                matador = "RAMMUS"
            } else {
                hp -= twitch //si no igual a 0 la hp li restem el atac de twitch
                matador = "TWITCH" // si hp queda igual a 0 el matador es twitch
            }
        }
        println("$matador $atacs")
    }
}