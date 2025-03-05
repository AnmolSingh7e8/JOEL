package `ITB 12b  Col·leccions (II)`
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades){ //Casos de prova
        val map: MutableMap<String, String> = LinkedHashMap() //Creem el map

        val anysCampionat = scanner.nextInt() //Demanem el numeor de paisos
        scanner.nextLine()

        repeat(anysCampionat-1){ //Afegim al mapa els paisos que volem

            val nom = scanner.nextLine()
            val listNoms = nom.split("-") //Separo els noms
            val any = listNoms[0].trim() //Agafo el pais
            val nomGuanyador = listNoms[1].trim() //Agafo la capital

            map.put(any, nomGuanyador) //Els fico al mapa

        }

        val guanyadorBuscat = scanner.nextLine() //Demano la capital del pais buscta

        val guanyador = map.filterValues { it == guanyadorBuscat }.keys
        //trobo el guanyador
         val contador = guanyador.size
        println(contador)
    }

}