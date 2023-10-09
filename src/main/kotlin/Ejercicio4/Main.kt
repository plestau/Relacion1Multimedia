package Ejercicio4

fun palindromo(palabra: String): Boolean{
    var i = 0
    var j = palabra.length - 1
    while(i < j){
        if(palabra[i] != palabra[j]){
            return false
        }
        i++
        j--
    }
    return true
}

fun main(){
    val palabra = "anitalavalatina"
    println("¿Es $palabra un palindromo? ${palindromo(palabra)}")
}