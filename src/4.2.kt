// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun triangulo(asterisco: Int) {
    var i=0
    for (item in 1..asterisco) {
//        Imprime espacios si corresponde
        for (espacio in 0..<asterisco-item) {
            print(" ")
        }

//        Imprime la primera parte de los asteriscos
        for (item2 in 0..<item) {
            print("*")
        }

//        Imprime la segunda de los
//        asteriscos si corresponde
        for (item3 in 0..<item-1) {
            print("*")
        }
//        Realiza un salto de linea y controla
//        el contador de asteriscos
        println()
        i++
    }
    println("-------------------------")
}
//fun main () {
//    val asteriscos = readln().toInt()
//    triangulo(asteriscos)
//}