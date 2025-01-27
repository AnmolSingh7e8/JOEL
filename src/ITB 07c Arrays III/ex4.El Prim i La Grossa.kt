package `ITB 07c Arrays III`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetiem el bules les vegades que volguem

    repeat(numVegades) {
        val import = scanner.nextInt()
        val lista = mutableListOf<Int>() //creem una llista mutable
        var aposta = scanner.nextInt()

        while (aposta > 0) { //mentres que les apostes siguin mes gran que 0 fem el bucles
            lista.add(aposta) //afegim a la llista els valors de l'aposta
            aposta = scanner.nextInt() //demanem de nou valors
        }

        lista.sort() //ordenem la llista

        var solicitut = 0
        var sumaImport = 0

        for(i in lista){
            if (sumaImport + i <= import) { //condicio per saber les solicituts
                sumaImport += i
                solicitut++
            }

        }
        println(solicitut)
    }
}


