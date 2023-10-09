package Ejercicio5

fun contadorLetras(frase: String, letra: Char): String{
    var contador = 0
    for(i in 0 until frase.length){
        if(frase[i] == letra){
            contador++
        }
    }
    return "La letra '$letra' aparece $contador veces"
}

fun main(){
    println(contadorLetras("Hola mundo", 'o'));
}