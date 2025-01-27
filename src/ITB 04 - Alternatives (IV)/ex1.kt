package `ITB 04 - Alternatives (IV)`import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val nota = scanner.nextInt() //demanem la nota
    when(nota){
        in 0..4 -> println("Suspes") // imprimim el resultat de la nota
        5,6 -> println("Aprovat")
        7,8 -> println("Notable")
        9,10 -> println("Excelent")
    }
}
