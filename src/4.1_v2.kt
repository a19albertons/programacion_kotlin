// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)


fun main () {
    var asterisco = readln().toInt()
    while (asterisco!=0) {
        var i=0
//    Imprime primero los espacio y despues *
        for (item in 0 .. asterisco-1) {
//        Imprime espacios
            for (espacio in 0 until i) {
                print(" ")
            }
//        imprime asteriscos
            for (item2 in item until asterisco) {
                print("*")
            }
//        Hace un salto de linea e incrementa
//        el contador de asteriscos
            println()
            i++
        }
        println("--------------------------------")
        asterisco= readln().toInt()
    }
}