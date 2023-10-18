package Ejercicio19

fun main() {
    println(eliminarVocales("Hola mundo"))
}

fun eliminarVocales(cadena: String): String {
    var cadenaSinVocales = ""
    for (i in cadena.indices) {
        if (cadena[i] != 'a' && cadena[i] != 'e' && cadena[i] != 'i' && cadena[i] != 'o' && cadena[i] != 'u') {
            cadenaSinVocales += cadena[i]
        }
    }
    return cadenaSinVocales
}