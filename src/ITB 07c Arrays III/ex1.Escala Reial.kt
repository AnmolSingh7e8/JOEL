package `ITB 07c Arrays III`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt()

    repeat(numVegades) {

        val cartes = IntArray(7) { scanner.nextInt() } //fem l'array
        cartes.sort() //ordenem l'array
        val cartesQueTengo = BooleanArray(15) { false } //fem l'array per trobar si es escalal o no
        for (i in 0 until cartes.size) { //en aquest bucle gueardem els element de l'array de cartes en el de cartesQueTengo
            var posicio = cartes[i]
            cartesQueTengo[posicio] = true
            if (posicio == 1) {
                cartesQueTengo[14] = true
            }
        }

        var contador = 0
        var escala = false

        for (j in 1 until cartesQueTengo.size) { //mirem si es escala amb un altre for on ens ajdem amb un comptador
            if (cartesQueTengo[j]) {
                contador++
                if (contador == 5) {
                    escala = true
                }
            } else {
                contador = 0
            }
        }
            //mirem si es escala reial o no
            val escalaReial:Boolean = cartesQueTengo[1] && cartesQueTengo[10] && cartesQueTengo[11] && cartesQueTengo[12] && cartesQueTengo[13]
                if(escalaReial){
                    println("ESCALA REIAL")
                } else if(escala){
                    println("ESCALA")
                } else {
                    println("NO")
                }
        }
}