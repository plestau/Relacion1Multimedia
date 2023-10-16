package Ejercicio23

fun main(){
    println(esArmstrong(153))
    println(esArmstrong(154))
}

fun esArmstrong(number: Int): Boolean {
    var sum = 0
    var num = number
    val digits = number.toString().length

    while (num > 0) {
        sum += Math.pow((num % 10).toDouble(), digits.toDouble()).toInt()
        num /= 10
    }

    return sum == number
}