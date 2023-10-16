package Ejercicio14

fun main() {
    println(escalera(15))
}

fun escalera(numero: Int): String {
    var escalera = ""
    for (i in 1..numero) {
        for (j in 1..i) {
            escalera += i
        }
        escalera += "\n"
    }
    return escalera
}