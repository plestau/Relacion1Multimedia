package Ejercicio17

fun main() {
    println(listaPares(listOf(1, 2, 3, 4, 5)))
}

fun listaPares(lista: List<Int>): List<Int> {
    val listaPares = mutableListOf<Int>()
    for (i in lista) {
        if (i % 2 == 0) {
            listaPares.add(i)
        }
    }
    return listaPares
}