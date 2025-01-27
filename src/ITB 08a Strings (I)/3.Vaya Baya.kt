package `ITB 08a Strings (I)`

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val numVegades = scanner.nextInt() //repetim les vegades que volguem el codi
    scanner.nextLine()
    repeat(numVegades) { //ho repetim amb el repeat
      var frase = scanner.nextLine() //demano la frase
        var fraseNova = "" //faig una variable buida on ficare el canvi
        for(letra in frase){
            when(letra){ //faig un when per substituir les b per v i v per b
                'b' -> fraseNova += 'v'
                'v' -> fraseNova += 'b'
                'B' -> fraseNova += 'V'
                'V' -> fraseNova += 'B'
                else -> fraseNova += letra
            }
        }
        println(fraseNova)
    }
}