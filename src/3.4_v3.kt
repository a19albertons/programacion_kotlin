import kotlin.system.exitProcess

// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Entradas y procesado
    while (true) {
        val num_veces = readlnOrNull()
        if (num_veces != null) {
            val num_veces_int = num_veces.toInt()
            val numeros = readln()
            val lista_numeros = numeros.split(" ")
            var suma:Int=0
            //    Procesado final
            for (item in 0 until num_veces_int) {
                suma+=lista_numeros[item].toInt()
            }
            println(suma)
        }
        else {
            break
        }
    }
}