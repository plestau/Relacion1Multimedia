package Ejercicio16


fun main() {
    println(productoLista(listOf(1, 2, 3, 4, 5)))
}

fun productoLista(lista: List<Int>): Int {
    var producto = 1
    for (i in lista) {
        producto *= i
    }
    return producto
}