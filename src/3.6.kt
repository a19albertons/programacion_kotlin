//  Procesamos la solicitud
fun myIndexOf(frase: String, caracter: String): Int {
    var resultado = -1
    for (item in 0..frase.lastIndex) {
        if (frase[item].toString() == caracter.toString()) {
            resultado = item
            break
        }
    }
    return (resultado)
}
fun main() {
//    Introducimos las entradas
    val frase = readln()
    val caracter = readln()


    println(myIndexOf(frase, caracter))
}