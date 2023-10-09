package Ejercicio2

fun sumatoria(lista: List<Int>): Int{
    var sum = 0
    for(i in 0 until lista.size){
        sum += lista[i]
    }
    return sum
}

fun main(){
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(sumatoria(lista))
}