package `ITB 06c Bucles III`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //variable per imprimir la sequenecia les vegades que vulgui
//fem un for per fer la sequencia de numeros
    repeat(numVegades) { //Repetim el numero de vegades que volguem
        var profunditat = scanner.nextInt()
        var puja = scanner.nextInt()
        var cau = scanner.nextInt()
        var numDies = 0
        var altura = 0
        if (puja >= profunditat){ //si el cargol puja mes que la profunditat imprimeixo 1
            println(1)
        }
        else if (puja > cau) { //Si puja mes que del cau doncs entro al bucle
            while (altura < profunditat) { //bucle per comptar els dies en el cas en que l'altura es menor que la profunditat
                numDies++
                altura += puja
                if(altura < profunditat) { //si l'alutra segueix sent menor segueix el bucle
                    altura -= cau
                }
            }
            println(numDies)
        }
        else { //en el cas contrari els anteriors imprimim no
            println("NO")
        }
    }
}