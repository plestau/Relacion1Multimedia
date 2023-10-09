package Ejercicio11

fun mcd(a: Int, b: Int): Int{
    var a = a
    var b = b
    while(a != b){
        if(a > b){
            a -= b
        }else{
            b -= a
        }
    }
    return a
}

fun main(){
    println(mcd( 20, 33))
}