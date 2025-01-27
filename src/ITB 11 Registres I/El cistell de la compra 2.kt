package `ITB 11 Registres I`
import java.util.*

data class Producte ( //creem la data class on emmagatzemarem el preu i el nom dels productes
    var nom: String, //afegim valors
    var preu: Float
)

fun main (){
    val scan = Scanner(System.`in`)
    val numVegades = scan.nextInt()//fem els casos de prova
    scan.nextLine()

    val llistaDeProductes = mutableListOf<Producte>()

    for (i in 1..numVegades){ //fem els casos de prova

        val product = scan.nextLine().split(" ") //fem els casos de prova

        val nom = product[0]
        val preu = product[1].toFloat()

        llistaDeProductes.add(Producte(nom, preu))//ho fiquem en la llista de fora
    }
    val producteBuscat = scan.nextLine()//demanem el valor buscar

    var producteTrobat = false //boolean per detecar si el producte s'ha trobat o no
    var posicio = 0 //variable que guarda la posicio

    llistaDeProductes.sortBy { it.nom } //ordenem la llista pels noms

    for(i in 0 until numVegades){ //recorrem els productes
        if(llistaDeProductes[i].component1() == producteBuscat){ //si es troba el producte que volem trobar
            producteTrobat = true //canviem les variables
            posicio = i
        }
    }

    if(producteTrobat){ //si esta el producte
        print("SI, M'HA COSTAT ${llistaDeProductes[posicio].component2()}")

    if(posicio != 0) { //si la posicio d'aquest no el la primera
        print(" I TAMBE TINC ${llistaDeProductes[posicio - 1].component1()} A ${llistaDeProductes[posicio - 1].component2()}")
    }
    } else //si no es troba
        print("NO N'HI HAVIA")
}