package `ITB 10a Llistes (I)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demaanem el numero de casos

    repeat(numVegades){ //repetim el numero de casos

        val numElements = scanner.nextInt() //demanem el numero de noms que hi haura en l'array
        scanner.nextLine()
        val secuencia = Array(numElements){" "} //creem l'array

        repeat(numElements){ //repetim per guradar a l'array el noms
            secuencia[it] = scanner.next()
        }

        val posicio = scanner.nextInt() //demanem la posicio per no imprimirla

        for(i in 0 until numElements){ //recorrem l'array i no imprimim aquella posicio
            if(i != posicio){
                println(secuencia[i])
            }
        }
    }
}