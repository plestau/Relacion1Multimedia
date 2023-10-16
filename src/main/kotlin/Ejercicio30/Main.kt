package Ejercicio30


fun main() {
    println(esTriangular(3))
    println(esTriangular(6))
    println(esTriangular(12))
}

fun esTriangular(number: Int): Boolean {
    var sum = 0
    var i = 1

    while (sum < number) {
        sum += i
        i++
    }

    return sum == number
}