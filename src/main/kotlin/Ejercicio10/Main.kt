package Ejercicio10

fun fibonacci(n: Int): Int{
    if(n == 0 || n == 1){
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main(){
    println(fibonacci( 17))
}