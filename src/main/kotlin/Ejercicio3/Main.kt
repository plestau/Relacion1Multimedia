package Ejercicio3

fun convertidorMillasKm(millas: Double): Double{
    return millas * 1.60934
}

fun main(){
    val millas = 10.0
    println("$millas millas son ${convertidorMillasKm(millas)} km")
}