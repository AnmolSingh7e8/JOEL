package `ITB 06d Bucles IV`

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //demano la paraula
    scanner.nextLine()

    repeat(numVegades) { //repetim el numero de vegades que volguem

        val secuencia = scanner.nextLine().lowercase() //lowercase perque detecti minuscules
        val frase = secuencia.split(", ") //Demanem una llista separada per comasa
        var capacitatTelaranya = scanner.nextInt() //demanem la cpacitat que te una telarnaya
        scanner.nextLine()//nova linea despres del integer
        var numLalafel = 0
        var numTelaranya = 0

        for (i in frase){ //analitzem el contingut de la llista que la i es cada paraula

            when(i){ //fem les següents condicions
                "lalafel" -> numLalafel++
                "aranya" -> {
                    numTelaranya = 0
                    numLalafel = 0
                }
                "telaranya" -> numTelaranya++
            }

        }
        //opreacio per omplir les telaranyes
        var completas = 0
        if (capacitatTelaranya <= 0 || numTelaranya == 0) {
            numTelaranya = 0
        } else {
           completas = numLalafel/capacitatTelaranya
            if(completas > numTelaranya){
                completas = numTelaranya
            }
        }
        println("Hay $completas telaranyas llenas.")
    }
}