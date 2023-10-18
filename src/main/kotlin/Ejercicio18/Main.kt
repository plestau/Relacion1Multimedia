package Ejercicio18

// Crea una función que determine si un número es primo.

fun main() {
    println(esPrimo(14))
}

fun esPrimo(numero: Int): Boolean {
    var esPrimo = true
    for (i in 2 until numero) {
        if (numero % i == 0) {
            esPrimo = false
            break
        }
    }
    return esPrimo
}