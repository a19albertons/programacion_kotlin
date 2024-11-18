import kotlin.system.exitProcess

// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Entradas y procesado
    var num_veces:Int = 1
    while (num_veces != 0) {
        num_veces = readln().toInt()
        if (num_veces != 0) {
            val numeros = readln()
            val lista_numeros = numeros.split(" ")
            var suma:Int=0
            //    Procesado final
            for (item in 0..<num_veces) {
                suma+=lista_numeros[item].toInt()
            }
            print(suma)
        }

    }
}