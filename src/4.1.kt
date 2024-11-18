// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun trianguloPuntaAbajo(asterisco: Int) {
    var i=0
//    Imprime primero los espacio y despues *
    for (item in 0..asterisco-1) {
//        Imprime espacios
        for (espacio in 0..<i) {
            print(" ")
        }
//        imprime asteriscos
        for (item2 in item..<asterisco) {
            print("*")
        }
//        Hace un salto de linea e incrementa
//        el contador de asteriscos
        println()
        i++
    }
    println("-------------------------")
}
//fun main () {
//    val asteriscos = readln().toInt()
//    trianguloPuntaAbajo(asteriscos)
//}