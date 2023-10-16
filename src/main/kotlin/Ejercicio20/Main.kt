package Ejercicio20

fun main() {
    println(factorial(5))
}

fun factorial(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}