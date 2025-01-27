package `ITB 10b Llistes (II)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim els caos de prova

    repeat(numVegades){
        val llistaSize = scanner.nextInt() //demanem el tamany de la llista
        val llista = mutableListOf<Int>() //creem la llista

        repeat(llistaSize){ //afegim els numeros a la llista
            llista.add(scanner.nextInt())
        }

        val numNou = scanner.nextInt() //demanem el nou numero y la posicio en la qual es colara
        val posColar = scanner.nextInt()
        val llistaNova = mutableListOf<Int>()

        for(i in 0 until llistaSize+1){ //recorrem la llsta afegint una nova posicio
            if(i == posColar){ //Mirem si la i es igual a la nova posicio
                llistaNova.add(numNou)//dons la afegim
            }
            else{
                if(i < posColar){ //mirem les anteriors posicions
                    llistaNova.add(llista[i])//les afegim a la nova llista
                } else {
                    llistaNova.add(llista[i-1]) //mirem
                }
            }
        }
        println("${llistaNova.joinToString(" ")}")
    }

}