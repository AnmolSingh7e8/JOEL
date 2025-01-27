package `ITB 09c Matrius (III)`

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //per indicar quants casos de prova farem
    repeat(numVegades){ //fem els casos de prova

        val matriu: MutableList<MutableList<Int>> = mutableListOf() //creem  la matriu

        val amplada = scanner.nextInt() //demano els valors d'entrada
        val altura = scanner.nextInt()
        val numfantasmes = scanner.nextInt()

        for (i in 0 until amplada) { //omplo la matriu amb 0
            val fila: MutableList<Int> = mutableListOf()
            for (j in 0 until altura) {
                fila.add(0)
            }
            matriu.add(fila)
        }
        val posicioBlauX = scanner.nextInt() //afegim la posicio del fantasma blau
        val posicioBlauY = scanner.nextInt()
        matriu[posicioBlauX][posicioBlauY] = 3

        repeat(numfantasmes-1){ //afegim la posicio dels altres fantasmes
            val posicio1 = scanner.nextInt()
            val posicio2 = scanner.nextInt()
            matriu[posicio1][posicio2] = 1
        }

        var moviment = false
        for (i in 0 until amplada) { //omplim les cantonades
            for (j in 0 until altura) {
                if (i == 0 || j == 0 || i == amplada - 1 || j == altura - 1) {
                    matriu[i][j] = 2
                }
            }
        }

        for(i in 0 until amplada){
            for(j in 0 until altura){
                //ens fixem en la posicio
                if(matriu [i][j] == 3){
                    //mirem si es pot moure
                    if(matriu[i][j+1] == 0 || matriu[i+1][j] == 0 || matriu[i][j-1] == 0 || matriu[i-1][j] == 0){
                        moviment = true
                    }

                }
            }
        }
        if(moviment) {
            println("THIS IS FINE")
        } else{
               println("OH NO")
        }
    }
}