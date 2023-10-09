package Ejercicio9

fun calculoMCD(num1: Int, num2: Int): Int{
    var a = num1
    var b = num2
    var r = 0
    while (b != 0){
        r = a % b
        a = b
        b = r
    }
    return a
}

fun main(){
    println(calculoMCD(120, 1200))
}