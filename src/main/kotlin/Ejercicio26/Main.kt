package Ejercicio26

fun main() {
    println(palabraMasLarga(listOf("hola", "adios", "buenas", "hasta luego", "hasta mañana")))
}

fun palabraMasLarga(words: List<String>): List<String> {
    val longestWords = mutableListOf<String>()
    var longestWordLength = 0

    for (word in words) {
        if (word.length > longestWordLength) {
            longestWords.clear()
            longestWords.add(word)
            longestWordLength = word.length
        } else if (word.length == longestWordLength) {
            longestWords.add(word)
        }
    }

    return longestWords
}