package Ejercicio13

fun main() {
    println(emmetToHtml("a"))
    println(emmetToHtml("div.oferta"))
    println(emmetToHtml("div.coche#VWPolo"))
}

fun emmetToHtml(emmet: String): String {
    val tag = emmet.split(".","#")
    var html = "<${tag[0]}"

    if (tag.size > 1) {
        for (i in 1 until tag.size) {
            if (tag[i].first() == '#') {
                html += " id=\"${tag[i].substring(1)}\"" // NO FUNCIONA
            } else {
                html += " class=\"${tag[i]}\""
            }
        }
    }

    html += "></${tag[0]}>"

    return html
}