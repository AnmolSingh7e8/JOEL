package `ITB 10a Llistes (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demaanem el numero de casos

    repeat(numVegades){

        val numCotxes = scanner.nextInt()//demano el numero de cotxes
        scanner.nextLine()
        val llista = mutableListOf<String>()//creem la llista
        repeat(numCotxes) { //repetim per afegir el nom dels cotxes
            val cotxes = scanner.nextLine()
            llista.add(cotxes)
        }
        for(i in 0 until numCotxes){ //recorrem la llista
            if(llista[i] == "Francesco Virgolini"){ //cambiem de posicio
                llista[i] = llista[i -1] //cambiem de posicio al element davant del francesco virgolini
                llista[i -1] = "Francesco Virgolini" //adelantmem la posicio del virgolini
            }
        }
        println(llista)
    }
}