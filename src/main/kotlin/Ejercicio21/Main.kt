package Ejercicio21

fun main() {
    println(invertir("hola"))
}

fun invertir(cadena: String): String {
    var invertida = ""
    for (i in cadena.length - 1 downTo 0) {
        invertida += cadena[i]
    }
    return invertida
}