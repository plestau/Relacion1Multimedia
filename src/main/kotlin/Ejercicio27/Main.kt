package Ejercicio27

fun main() {
    println(palabraMasCorta(listOf("hola", "adios", "buenas", "hasta luego", "hasta mañana")))
}

fun palabraMasCorta(words: List<String>): List<String> {
    val shortestWords = mutableListOf<String>()
    var shortestWordLength = Int.MAX_VALUE

    for (word in words) {
        if (word.length < shortestWordLength) {
            shortestWords.clear()
            shortestWords.add(word)
            shortestWordLength = word.length
        } else if (word.length == shortestWordLength) {
            shortestWords.add(word)
        }
    }

    return shortestWords
}