import kotlin.system.exitProcess

// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun diamante(asterisco: Int,caracter: Char) {
    if (asterisco < 1 || asterisco > 31 || asterisco%2 == 0) {
        println("-------------------------")
        exitProcess(0)
    }
    var i=0
    for (item in 1..asterisco) {
//        Imprime espacios si corresponde
        for (espacio in 0..<asterisco-item) {
            print(" ")
        }

//        Imprime la primera parte de los asteriscos
        for (item2 in 0..<item) {
            print(caracter)
        }

//        Imprime la segunda de los
//        asteriscos si corresponde
        for (item3 in 0..<item-1) {
            print(caracter)
        }
//        Realiza un salto de linea y controla
//        el contador de asteriscos
        println()
        i++
        if (asterisco/2<i) {
            break
        }
    }
    for (item in asterisco downTo  1 ) {
        if (item>=i) {
            continue
        }
//        Imprime espacios si corresponde
        for (espacio in 0..<asterisco-item) {
            print(" ")
        }

//        Imprime la primera parte de los asteriscos
        for (item2 in 0..<item) {
            print(caracter)
        }

//        Imprime la segunda de los
//        asteriscos si corresponde
        for (item3 in 0..<item-1) {
            print(caracter)
        }
//        Realiza un salto de linea y controla
//        el contador de asteriscos
        println()

    }

    println("-------------------------")
}
//fun main () {
//    val asteriscos = readln().toInt()
//    val caracter = "\\u2661"
//    val caracter2:Char = caracter[0]
//    diamante(asteriscos, caracter2)
//}