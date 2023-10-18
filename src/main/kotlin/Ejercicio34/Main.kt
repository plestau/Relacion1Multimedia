package Ejercicio34

fun main() {
    println(karaca("banana", true))
    println(karaca("0n0n0baca", false))
}

private fun karaca(text: String, isKaraca: Boolean): String {

    var result = ""

    text.lowercase().split(" ").forEach { word ->

        if (isKaraca) {
            result += word
                    .dropLast(3)
                    .replace("0", "a")
                    .replace("1", "e")
                    .replace("2", "i")
                    .replace("3", "o")
                    .replace("4", "u")
                    .reversed().plus(" ")
        } else {
            result += word
                    .reversed()
                    .replace("a", "0")
                    .replace("e", "1")
                    .replace("i", "2")
                    .replace("o", "3")
                    .replace("u", "4")
                    .plus("aca ")
        }
    }

    return result
}