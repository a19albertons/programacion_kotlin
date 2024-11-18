// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

//Funcion cuadrado
fun cuadrado2(num_caracteres: Int, letra: Char) {

//    Inicializa el bucle que realizara la impresion
    for (item in 0 until num_caracteres) {

//        Controla la impresion de linea con
//        letra y espacio
        if (item == 0 || item == num_caracteres-1) {
            for (item2 in 0 until num_caracteres) {
                print(letra)
                print(" ")
            }
            println()
        }

//        Controla la impresion de linea con
//        solo la letra al final y principio
        else {
            for (item2 in 0 until num_caracteres) {
                if (item2 == 0 || item2 == num_caracteres -1) {
                    print(letra)
                    print(" ")
                }
                else {
                    print("  ")
                }

            }
            println()
        }
    }
    println("--------------------------------")
}

fun main() {
    while (true) {
        try {
            var (num_caracteres, letra) = readln().split(" ").let { it[0].toInt() to it[1].first() }
            cuadrado(num_caracteres, letra.toChar())

        } catch (e: Exception) {
            break
        }

    }
}