fun flipChar(texto: String): String {
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
//fun main(){
//    println(flipChar("En un lugar de la Mancha"))
//    println(flipChar("El MOS6502 es un microprocesador de 8 bits de 1975"))
//    println(flipChar("\"Veni, vidi, vici\"; Julius Caesar 47 a.C."))
//}