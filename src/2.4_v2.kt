// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Pedimos valores de entrada y se procesan
    val peso = readln().toFloat()
    val altura = readln().toFloat()

//    Calculo IMC
    val imc = peso / altura /altura

//    Procesado condiciones
    when {
        imc < 18.5 -> print("Delgado")
        imc >= 18.5 && imc < 25.0 -> print("Normal")
        imc >= 25.0 && imc < 30.0 -> print("Sobrepeso")
        imc >= 30.0 -> print("Obeso")
    }
}
