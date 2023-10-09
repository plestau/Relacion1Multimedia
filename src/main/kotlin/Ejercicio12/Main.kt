package Ejercicio12

fun esCapicua(numero: Int): Boolean{
    var numero = numero
    var numeroInvertido = 0
    var numeroOriginal = numero
    while(numero > 0){
        numeroInvertido = numeroInvertido * 10 + numero % 10
        numero /= 10
    }
    return numeroOriginal == numeroInvertido
}

fun main(){
    println(esCapicua( 12321))
}