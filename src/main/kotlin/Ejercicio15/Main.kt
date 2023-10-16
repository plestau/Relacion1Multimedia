package Ejercicio15

fun main() {
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(1, 2, 3, 4, 5)
    val array3 = arrayOf(1, 2, 3, 4, 5)
    val array4 = arrayOf(1, 2, 3, 4, 6)

    println(compararArrays(array1, array2).contentToString())
    println(compararArrays(array3, array4).contentToString())
}

fun compararArrays(array1: Array<Int>, array2: Array<Int>): Array<Boolean> {
    val arrayBooleanos = Array(array1.size) { false }
    for (i in array1.indices) {
        if (array1[i] == array2[i]) {
            arrayBooleanos[i] = true
        }
    }
    return arrayBooleanos
}