package `ITB 12c  Col·leccions (III)`

import java.util.*


fun main(){
    val scanner = Scanner(System.`in`)

    val numVegades = scanner.nextInt()

    repeat(numVegades){
        val numNoms = scanner.nextInt()
        scanner.nextLine()
        val map: MutableMap<String, String> = mutableMapOf() //Creo el mapa
        repeat(numNoms-1 ){ //afegeixo els noms del amics -1
            var (amic1, amic2) = scanner.nextLine().split(" ") //demano els noms
            map[amic1] = amic2 //Si no existeix l'amistat es crea
            map[amic2] = amic1//Si existeix l'amistat s'actualitza
        }
        val nomBuscat = scanner.nextLine()

        println(map[nomBuscat]) //Dono l'amic buscat
    }

}