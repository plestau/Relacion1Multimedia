package Ejercicio6

// funcion que cuenta cuantas veces aparece una subcadena en un texto
fun cuentaCadenas(texto: String, subcadena: String): String{
    var contador = 0
    for(i in 0 until texto.length){
        if(texto[i] == subcadena[0]){
            var j = 0
            while(j < subcadena.length && i + j < texto.length){
                if(texto[i + j] != subcadena[j]){
                    break
                }
                j++
            }
            if(j == subcadena.length){
                contador++
            }
        }
    }
    return "La subcadena '$subcadena' aparece $contador veces"
}

fun main(){
    println(cuentaCadenas("Hola caracola", "ola"))
}