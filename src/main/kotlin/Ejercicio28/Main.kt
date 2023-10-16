package Ejercicio28

fun main() {
    println(soloEspacios("hola"))
    println(soloEspacios("hola mundo 123."))
    println(soloEspacios("hola mundo"))
}

fun soloEspacios(text: String): Boolean {
    for (char in text) {
        if (!char.isLetter() && !char.isWhitespace()) {
            return false
        }
    }

    return true
}