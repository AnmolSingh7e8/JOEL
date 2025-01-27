package `ITB 11 Registres I`

import java.util.*

fun main (){
    val scan = Scanner(System.`in`)
    data class Producte ( //creem la data class on emmagatzemarem el preu i el nom dels productes
        var nom: String, //afegim valors
        var preu: Float
    )
    val numVegades = scan.nextInt()//fem els casos de prova
    scan.nextLine()

    val llistaDeProductos = mutableListOf<Producte>()

    for (i in 1..numVegades){ //fem els casos de prova

        val product = scan.nextLine().split(" ") //fem els casos de prova

        val nom = product[0]
        val preu = product[1].toFloat()

        llistaDeProductos.add(Producte(nom, preu))//ho fiquem en la llista de fora
    }

    llistaDeProductos.sortByDescending {it.preu} //ordenem la llista de manera descendent

    val producteBuscat = scan.nextInt()//demanem el valor buscar


    val masCaro = llistaDeProductos.first() //guardem en cada variable els valor que despres imprimirem
    val masbarato = llistaDeProductos.last()
    val buscat = llistaDeProductos[producteBuscat - 1]

    println("EL MES CAR: ${masCaro.component1()} ${masCaro.component2()}")
    println("EL MES BARAT: ${masbarato.component1()} ${masbarato.component2()}")
    println("EL BUSCAT: ${buscat.component1()} ${buscat.component2()}")
}