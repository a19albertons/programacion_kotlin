// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Pedimos valores
    val nota_numerica = readln().toFloat()

    when {
        nota_numerica >= 0.0 && nota_numerica < 3.0 -> println("Muy deficiente")
        nota_numerica >= 3.0 && nota_numerica < 5.0 -> println("Insuficiente")
        nota_numerica >= 5.0 && nota_numerica < 6.0 -> println("Bien")
        nota_numerica >= 6.0 && nota_numerica < 9.0 -> println("Notable")
        nota_numerica >= 9.0  && nota_numerica < 10.0 -> println("Sobresaliente")
    }
}