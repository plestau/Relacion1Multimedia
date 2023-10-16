package Ejercicio25

fun main() {
    println(numeroMin(listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))))
    println(numeroMin(listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9), listOf(10, 11, 12))))
}

fun numeroMin(matrix: List<List<Int>>): Int {
    var min = matrix[0][0]

    for (i in matrix) {
        for (j in i) {
            if (j < min) {
                min = j
            }
        }
    }

    return min
}