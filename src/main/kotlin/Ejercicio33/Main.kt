package Ejercicio33

fun main(args: Array<String>) {
    println(decimalABinario(10))
}

fun decimalABinario(numero: Int): String {
    var resultado = ""
    var numeroTmp = numero
    while (numeroTmp > 0) {
        resultado += numeroTmp % 2
        numeroTmp /= 2
    }
    return resultado.reversed()
}