package `ITB 12a Col·leccions (II)`
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades){ //Casos de prova
        val map: MutableMap<String, String> = mutableMapOf() //Creem el map

        val numPaisos = scanner.nextInt() //Demanem el numeor de paisos
        scanner.nextLine()

        repeat(numPaisos-1){ //Afegim al mapa els paisos que volem

            val nom = scanner.nextLine()
            val listNoms = nom.split("-") //Separo els noms
            val nomPais = listNoms[0].trim() //Agafo el pais
            val nomCapital = listNoms[1].trim() //Agafo la capital

            map.put(nomPais, nomCapital) //Els fico al mapa

        }

        val paisBuscat = scanner.nextLine() //Demano la capital del pais buscta

        val pais = map.entries.find { it.value == paisBuscat }?.key //Trobo el pais
            if(map.containsKey(paisBuscat)){
                println(map[paisBuscat])
            } else {
                println("NO HO SE")
            }

    }

}