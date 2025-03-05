import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    // Llegim el nombre total d'electrodomèstics
    val numElectrics = scanner.nextInt()
    scanner.nextLine()  // Línia de salt

    // Inicialitzem un mapa per emmagatzemar l'estat dels diferenciales
    val electrodom = mutableMapOf<String, Boolean>()
    // Llegim el diferencial trencat
    val diferencialRoto = scanner.nextLine().trim()

    // Processar cada dispositiu
    repeat(numElectrics-1) {
        val dispositiu = scanner.nextLine().trim()

        if (dispositiu == diferencialRoto) {
            // Si el dispositiu és el trencat, posem tots els estats a false
            for (key in electrodom.keys) {
                electrodom[key] = false
            }
        } else {
            // Canviem l'estat del dispositiu (true <-> false)
            electrodom[dispositiu] = electrodom.getOrDefault(dispositiu, false).not()
        }
    }

    // Comptar els diferencials en estat true i false
    var trueCont = 0
    var falseCont = 0

    for ((diferencial, estado) in electrodom) {
        if (diferencial != diferencialRoto) {
            // Comptar els estats true i false excloent el trencat
            if (estado) trueCont++ else falseCont++
        }
    }

    // Imprimir el resultat
    println("$trueCont $falseCont")
}
