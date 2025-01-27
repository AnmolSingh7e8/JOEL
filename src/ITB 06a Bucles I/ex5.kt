package `ITB 06a Bucles I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var danyIn = scanner.nextInt() //variable dany inicial
    var hp = scanner.nextInt() //variable vida
    var explosio = danyIn //variable explosio que comença per el dany inicial
    var atacs = 0
    while(hp > 0){ //aquest bucle s'acaba quan la hp es igual a 0
        hp -= explosio //aqui restem la exploso incial a la hp
        explosio+=danyIn //aqui cada vegada es suma la explosio amb ella
        atacs++ //aqui es suma en el contador de atacts cada vegada que es resta a la hp
    }
    println(atacs)
}
