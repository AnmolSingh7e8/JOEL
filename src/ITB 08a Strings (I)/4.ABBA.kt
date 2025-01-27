package `ITB- 08a Strings (I)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()
    repeat(numVegades) { //ho repetim amb el repeat

        //agafo els noms en una llista on cambio " " per " i" perque acaba en i
        val noms = scanner.nextLine().split(", ").toMutableList()
        val final = noms.last().split(" i ").last()

        var fraseFinal = "" //varaibles de trings buida per emmagatzemar les inicial
        noms.add(final)

        for(nom in noms) { //amb aquest bucle ens fixem en els elements de la llista
            var inicial = nom[0].uppercaseChar() //agafem la inicial amb les funcions següents
            inicial = when (inicial) { //condicio per si hi ha accents
                'À', 'Á' ->  'A'
                'È', 'É' ->  'E'
                'Ì', 'Í' ->  'I'
                'Ò', 'Ó' ->  'O'
                'Ù', 'Ú' ->  'U'
                else -> inicial
            }

            fraseFinal += inicial //ficem la inicial a la variable anterior

        }

        println(fraseFinal)

    }
}