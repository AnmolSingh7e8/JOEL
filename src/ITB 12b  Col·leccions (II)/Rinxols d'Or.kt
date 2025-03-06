import java.util.Scanner

// Defineix una classe de dades per representar un planeta amb nom, distància i massa.
data class Planeta(val nombre: String, val distancia: Double, val masa: Double)

fun main() {
    val scanner = Scanner(System.`in`)

    // Llegeix el nombre de vegades que es repetirà el procés.
    val numVegades = scanner.nextInt()

    repeat(numVegades) {
        // Llegeix el nombre de planetes.
        val numPlanetas = scanner.nextInt()
        scanner.nextLine()

        val planetas = mutableListOf<Planeta>()

        // Llegeix les dades dels planetes i les guarda a la llista.
        for (i in 0 until numPlanetas) {
            val entrada = scanner.nextLine().split(" ")
            val nomPlaneta = entrada[0]
            val distancia = entrada[1].toDouble()
            val massa = entrada[2].toDouble()

            planetas.add(Planeta(nomPlaneta, distancia, massa))
        }

        // Ordena els planetes per distància.
        val planetasOrdenats = planetas.sortedBy { it.distancia }

        // Troba la distància mediana.
        val medianIndex = planetasOrdenats.size / 2
        val medianDistance = planetasOrdenats[medianIndex].distancia

        // Filtra els planetes amb la distància mediana.
        val planetesAmbDistanciaMediana = planetasOrdenats.filter { it.distancia == medianDistance }

        val resultat = if (planetesAmbDistanciaMediana.size == 1) {
            // Si només hi ha un planeta amb la distància mediana, retorna el seu nom.
            planetesAmbDistanciaMediana[0].nombre
        } else {
            // Si hi ha més d'un, ordena'ls per massa i tria el del mig.
            val massaOrdenada = planetesAmbDistanciaMediana.sortedBy { it.masa }
            massaOrdenada[massaOrdenada.size / 2].nombre
        }

        // Imprimeix el nom del planeta seleccionat.
        println(resultat)
    }
}
