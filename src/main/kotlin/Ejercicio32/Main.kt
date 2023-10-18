package Ejercicio32

fun main(args: Array<String>) {
    val claves = listOf("a", "b", "c")
    val valores = listOf(1, 2, 3)
    println(crearDiccionario(claves, valores))
}

fun crearDiccionario(claves: List<String>, valores: List<Int>): Map<String, Int> {
    return mapOf("a" to 1, "b" to 2, "c" to 3)
}

