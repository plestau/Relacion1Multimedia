package Ejercicio8

fun sumaDigitos(num: Int): Int{
    var resultado = 0;
    var numStr = num.toString()
    for (i in numStr){
        resultado += i.toString().toInt()
    }
    return resultado
}

fun main(){
    println(sumaDigitos(245))
}