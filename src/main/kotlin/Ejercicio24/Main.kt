package Ejercicio24

fun main() {
    println(numeroMax(listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))))
    println(numeroMax(listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9), listOf(10, 11, 12))))
}

fun numeroMax(matrix: List<List<Int>>): Int {
    var max = matrix[0][0]

    for (i in matrix) {
        for (j in i) {
            if (j > max) {
                max = j
            }
        }
    }

    return max
}