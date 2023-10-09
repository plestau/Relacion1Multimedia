package Ejercicio7

fun transforMayusculas(texto: String): String{
    var palabras = texto.split(" ")
    val res = palabras.map { it.replaceFirstChar { it.uppercase() } }
    return res.joinToString(" ")
}

fun main(){
    println(transforMayusculas("hola mundo ejemplo de palabras sin maysuculas"))
}