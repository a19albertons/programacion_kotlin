fun calcularIMC(peso:Double, altura:Double):Double {
    return peso/(altura*altura)
}
fun interpretarIMC(imc: Double): String {
    when {
        imc < 18.5 -> return "Bajo peso"
        imc < 24.9 -> return "Peso normal"
        imc < 29.9 -> return "Sobrepeso"
        else -> return "Obesidad"
    }
}
//fun main() {
//    val peso = 74.0 // en kilogramos
//    val altura = 1.66 // en metros
//    val imc=calcularIMC(peso, altura)
//    val descripcion=interpretarIMC(imc)
//    println("$imc , $descripcion")
//}