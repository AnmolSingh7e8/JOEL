package `ITB 08a Strings (I)`

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()

    repeat(numVegades) { //ho repetim amb el repeat

        val numParaules = scanner.nextInt() //demano les paraules
        scanner.nextLine()
        val secuencia = Array(numParaules){""} //les fico en un array

        repeat(numParaules) { //repetim les vegades que hem ficat
            secuencia[it] = scanner.nextLine()
        }

        var longitudBe = secuencia[0].length //mirem la longitud de la primera paraula
        var mateixaLong = false //per comprobar si la longitud es la mateixa en les altres paraules

        for(palabra in secuencia){ //mirem la longitus de les paraules

            if(palabra.length == longitudBe){ //comprovem que tinguin la mateixa longitud
                mateixaLong = true
            }
        }
        var charIguals = true
        if(mateixaLong){ //si te la mateixa longitud seguim
            for(i in 0 until secuencia.size-1){ //mirem la longitud en el bucle

                var palabra1 = secuencia[i] //comparem les altres paraules amb la primera
                var palabra2 = secuencia[i + 1]
                var diferencies = 0

                for(j in palabra1.indices){ //per determinar si hi ha lletres diferents o no
                    if(palabra1[j] != palabra2[j]){
                        diferencies++
                    }
                }

                if(diferencies != 1){ //si hi ha una lletra diferent s'anula
                    charIguals = false
                }
            }
        }
        if(charIguals && mateixaLong){ //imprimim el resultat
            println("CORRECTE")
        } else {
            println("INCORRECTE")
        }
    }
}