package Ejercicio35

fun main(args: Array<String>) {
    val lista = listOf(2, 6, 4, 8, 9)
    println(ordenar(lista, "Asc"))
    println(ordenar(lista, "Desc"))
}

fun ordenar(lista: List<Int>, orden: String): List<Int> {
    return if (orden == "Asc") {
        var listaOrdenada = lista
        var listaOrdenada2 = mutableListOf<Int>()
        var menor = listaOrdenada.minOrNull()
        var index = 0
        while (listaOrdenada.isNotEmpty()) {
            if (listaOrdenada[index] == menor) {
                listaOrdenada2.add(menor!!)
                listaOrdenada = listaOrdenada.minus(menor)
                menor = listaOrdenada.minOrNull()
                index = 0
            } else {
                index++
            }
        }
        listaOrdenada2
    } else {
        var listaOrdenada = lista
        var listaOrdenada2 = mutableListOf<Int>()
        var mayor = listaOrdenada.maxOrNull()
        var index = 0
        while (listaOrdenada.isNotEmpty()) {
            if (listaOrdenada[index] == mayor) {
                listaOrdenada2.add(mayor!!)
                listaOrdenada = listaOrdenada.minus(mayor)
                mayor = listaOrdenada.maxOrNull()
                index = 0
            } else {
                index++
            }
        }
        listaOrdenada2
    }
}