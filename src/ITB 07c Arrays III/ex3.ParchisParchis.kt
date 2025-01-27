package `ITB 07c Arrays III`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim el bucle les vegades que volguem

    repeat(numVegades) {
        val posInicial = scanner.nextInt() //agafo la posicio inicial
        val dau = arrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()) //faig un array per les tirades del dau
        var posicio = posInicial
        var suma = 0 //variables per fer operacion i ficar el resultat aqui
        var resta = 0
        for(i in dau){ //bucle per trobar la posicio
            suma = posicio + i
            if(posicio == 8){
                posicio = 8
            } else if(suma>8) { //diferents condicion per esl diferents casos
                resta = suma - 8
                posicio = 8 - resta

            } else if (posicio <8){
                posicio = suma
            }
        }
        println(posicio)
        }
    }