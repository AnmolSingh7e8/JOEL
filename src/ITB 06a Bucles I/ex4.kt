package `ITB 06a Bucles I`
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var nombreUsuario = scanner.nextLine() // Introduim la paraula
    var primeraLetra = nombreUsuario.get(0) //Agafem la primera lletra de la paraula
    var esRepetida = true //Si es repetida vol dir que es veritat
    var posicio = 0 //Per verificar la posicio en la paraula

    while (posicio < nombreUsuario.length) { //En el bucle mirem els caracters de la paraula

        if (nombreUsuario.get(posicio) != primeraLetra)
            esRepetida = false
            posicio++

    }
    if (esRepetida == false) println("SI") //condicio per comprovar els caracters
    else println("NO")
}
