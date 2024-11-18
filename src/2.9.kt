// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Pedimos valores
    val nota_numerica = readln().toFloat()

    when {
        nota_numerica in 0.0..<3.0 -> println("Muy deficiente")
        nota_numerica in 3.0..<5.0 -> println("Insuficiente")
        nota_numerica in 5.0..<6.0 -> println("Bien")
        nota_numerica in 6.0..<9.0 -> println("Notable")
        nota_numerica in 9.0 ..<10.0 -> println("Sobresaliente")
    }
}