import kotlin.system.exitProcess

// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun diamantes(asterisco: Int,caracter: Char) {
    var i=0
    for (item in 1..asterisco) {
//        Imprime espacios si corresponde
        for (espacio in 0 until asterisco-item-(asterisco/2)) {
            print(" ")
        }

//        Imprime la primera parte de los asteriscos
        for (item2 in 0 until item) {
            print(caracter)
        }

//        Imprime la segunda de los
//        asteriscos si corresponde
        for (item3 in 0 until item-1) {
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
        for (espacio in 0 until asterisco-item-(asterisco/2)) {
            print(" ")
        }

//        Imprime la primera parte de los asteriscos
        for (item2 in 0 until item) {
            print(caracter)
        }

//        Imprime la segunda de los
//        asteriscos si corresponde
        for (item3 in 0 until item-1) {
            print(caracter)
        }
//        Realiza un salto de linea y controla
//        el contador de asteriscos
        println()

    }

    println("--------------------------------")
}
fun main () {
    while (true) {
        try {
            var (numero, caracter) = readln().split(" ").let { it[0].toInt() to it[1].first() }
            diamantes(numero.toInt(), caracter.toChar())

        } catch (e: Exception) {
            break
        }

    }

}