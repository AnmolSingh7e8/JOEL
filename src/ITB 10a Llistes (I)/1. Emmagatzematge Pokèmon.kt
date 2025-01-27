package `ITB 10a Llistes (I)`

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() // casos de prova
    val espaiBanc = scanner.nextInt() // número d'espais en el banc

    repeat(numVegades) {
        val pokemons = Array(espaiBanc) { 0 } // array per guardar els pokémons
        val nivellPokemons = Array(espaiBanc) { 0 } // array per guardar el seu nivell

        repeat(espaiBanc) { // emplenem l'array amb els pokémons
            pokemons[it] = scanner.nextInt()
        }
        repeat(espaiBanc) { // emplenem l'array amb el nivell dels pokémons
            nivellPokemons[it] = scanner.nextInt()
        }

        // Arrays per guardar el millor nivell per a cada tipus de Pokémon
        val millorNivell = IntArray(701) { -1 } // Inicialitzem amb -1 per indicar que no hi ha cap Pokémon
        val millorPosicio = IntArray(701) { -1 } // Per guardar l'índex del millor Pokémon

        // Trobar el millor nivell per a cada tipus de Pokémon
        for (i in 0 until espaiBanc) {
            val pokedex = pokemons[i]
            val level = nivellPokemons[i]

            if (millorNivell[pokedex] < level) { //mirem quin pokemon te mes nivell
                millorNivell[pokedex] = level
                millorPosicio[pokedex] = i
            }
        }

        // Llista per guardar els resultats finals
        val resultat = mutableListOf<Int>()

        // Crear la llista de resultats en l'ordre en què apareixen
        for (i in 0 until espaiBanc) {
            val pokedexId = pokemons[i]
            if (millorPosicio[pokedexId] == i) {
                resultat.add(pokedexId)
                // Marquem aquest Pokémon com ja processat per evitar duplicats en la sortida
                millorPosicio[pokedexId] = -1
            }
        }

        // Imprimim els resultats
        println(resultat.joinToString(" ") + " ")
    }
}