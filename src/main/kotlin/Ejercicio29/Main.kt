package Ejercicio29

fun main() {
    println(esAnagrama("amor", "roma"))
}

fun esAnagrama(word1: String, word2: String): Boolean {
    val word1List = word1.toList().sorted()
    val word2List = word2.toList().sorted()

    return word1List == word2List
}