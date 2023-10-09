package Ejercicio1

fun maximo(lista: List<Int>): Int{
    var max = lista[0]
    for(i in 1 until lista.size){
        if(lista[i] > max){
            max = lista[i]
        }
    }
    return max
}

fun main(){
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(maximo(lista))
}