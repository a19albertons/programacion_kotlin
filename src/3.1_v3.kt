// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Entradas y procesado
    val num_veces = readln().toInt()
    val numeros = readln()
    val lista_numeros = numeros.split(" ")
    var suma:Int=0
//    Procesado final
    for (item in 0 until num_veces) {
        suma+=lista_numeros[item].toInt()
    }
    println(suma)
}