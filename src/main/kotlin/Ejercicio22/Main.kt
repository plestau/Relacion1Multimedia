package Ejercicio22

fun main() {
    println(esPerfecto(6))
    println(esPerfecto(28))
    println(esPerfecto(496))
    println(esPerfecto(497))
}

fun esPerfecto(number: Int): Boolean {
    var sum = 0

    for (i in 1 until number) {
        if (number % i == 0) {
            sum += i
        }
    }

    return sum == number
}