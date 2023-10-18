package Ejercicio31

fun main(args: Array<String>) {
    val lista = listOf(1, 2, 3, 4, 5)
    println(duplicar(lista))
}

fun duplicar(lista: List<Int>): List<Int> {
    return lista.map { it * 2 }
}