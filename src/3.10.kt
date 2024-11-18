fun flipChar2(texto: String): String {
    var caracter:Char
    var nuevo_string = StringBuilder()
    for (item in texto) {
        caracter = item
        var nuevo_caracter: Int
        if (caracter in 'A'..'Z') {
            nuevo_caracter = caracter.toInt() or 0b0100000
        }
        else if (caracter in 'a'..'z') {
            nuevo_caracter = caracter.toInt() and 0b1011111
        }
        else {
            nuevo_caracter = caracter.toInt()
        }
        nuevo_string.append(nuevo_caracter.toChar())
    }
    return nuevo_string.toString()
}

//fun main() {
//    val texto = readln()
//
//    println(flipChar(texto))
//}