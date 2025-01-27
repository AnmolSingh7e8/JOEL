package `ITB 09a Matrius (I)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demanem el numero pel cual es repetira el programa

    repeat(numVegades) { //amb el repeat ho repetim
        val alumnes = scanner.nextInt()//demanem el numero de files
        val moduls = scanner.nextInt()
        val matriu: MutableList<Int> = mutableListOf() //creo una llista

        for (i in 0 until alumnes * moduls) {//creo la matriu
            matriu.add(scanner.nextInt())
        }

        val promedios = mutableListOf<Int>() //creo una llista per despres mostrar el resultat


        for (i in 0 until alumnes) { //faig un bucles per sumar totes les note de cada alumne
            var sumaNotas = 0
            for(j in 0 until moduls) {
                sumaNotas += matriu[i * moduls + j] //i i j son indices que van sumant
            }
            promedios.add(sumaNotas/moduls) //fem la mitjana i l'afegim a l'anterior llista
        }
        println(promedios.joinToString(" ")) //ho mostrem per pantalla
    }

}