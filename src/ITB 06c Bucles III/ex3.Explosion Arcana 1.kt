package `ITB 06c Bucles III`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val danyIni = scanner.nextInt()
    val explosions = scanner.nextInt()

    var dany = 0 // el dany total sera igual a 0 al principi
    var danyActual = danyIni // fem que el dany actual sigui el dany inicial

    // Amb un bucle for càlcul del dany total
    for (i in 1..explosions) {
        dany += danyActual // El dany actual es igual al dany inicial
        danyActual += danyIni // el dany actual el incrementem el 100% exemple: 100 = 100 + 100, 200 = 200+100
    }

    println(dany)
}