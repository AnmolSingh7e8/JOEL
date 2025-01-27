package `ITB 09a Matrius (I)`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    //Demanem les files i les columnes de la matriu
    val files = scanner.nextInt()
    val columnes = scanner.nextInt()

    val filesI = scanner.nextInt()//demano la posicio de la x inicial
    val columnesI = scanner.nextInt()

    val filesF = scanner.nextInt() //demano la posicio de la x final
    val columnesF = scanner.nextInt()

    //Definim una llista amb les files y les columnes a dins
    var matriu: MutableList<MutableList<Char>> = MutableList(files){MutableList(columnes){'.'}}

            for(i in 0 until  files){ //recorro la matriu
                for(j in 0 until columnes) {
                    if (i in filesI .. filesF && j in columnesI .. columnesF)
                        matriu[i][j] = 'X' //substitueixo la x per els punts on toca
                        print("${matriu[i][j]}") //ho mostro per la pantalla
                }
                print("\n")//salt de linia entre els caratcers
            }
    }