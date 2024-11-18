// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main() {
//    Pedimos valores de entrada y se procesan
    val entrada = readln()
    val lista_num = entrada.split(" ")
    val peso = lista_num[0].toFloat()
    val altura = lista_num[1].toFloat()

//    Calculo IMC
    val imc = peso / altura /altura

//    Procesado condiciones
    when {
        imc < 18.5 -> print("Delgado")
        imc in 18.5..<25.0 -> print("Normal")
        imc in 25.0..<30.0 -> print("Sobrepeso")
        imc >= 30.0 -> print("Obeso")
    }
}