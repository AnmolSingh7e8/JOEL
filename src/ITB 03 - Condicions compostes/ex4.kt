package `ITB 03 - Condicions compostes`import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt() //Demanem les cordenades (x,y)
    val y = scanner.nextInt()
    if(x == 0 && y == 0){ // x = 0 i y = 0, es troba en el mig
        println("1,2,3,4")
    }
    else if(x>0 && y<0){ // comparem les condicions de x i y
        println("4")
    }
    else if(x<0 && y>0){
        println("2")
    }
    else if(x<0 && y<0){
        println("3")
    }
    else if(x>0 && y>0){
        println("1")
    }
    else if(x>0 && y == 0) {
        println("1,4")
    }
    else if(x<0 && y==0) {
        println("2,3")
    }
    else if(x==0 && y>0) {
        println("1,4")
    }
    else if(x==0 && y<0) {
        println("3,4")
    }
}