fun calcularEdad(valor1:String, valor2: String): Int {
    val valor1_dividido = valor1.split("/")
    val valor2_dividido = valor2.split("/")
    var años = valor2_dividido[2].toInt()-valor1_dividido[2].toInt()
    if (valor2_dividido[1].toInt()>= valor1_dividido[1].toInt()) {
        if (valor2_dividido[0].toInt()>=valor1_dividido[0].toInt()) {
            años = años
        }
        else {
            años-=1
        }
    }
    else {
        años-=1
    }
    return  años
}
fun esMayorDeEdad(edad: Int): String {
    if (edad>=18) {
        return "eres mayor de edad"
    }
    else {
        return "eres menor de edad"
    }

}
//fun main() {
//    //formato fechas "dd/mm/aaaa"
//    var edad = calcularEdad("24/09/1968", "25/09/2023")  // calcularEdad(fechaNacimiento, fechaActual)
//    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
//    edad = calcularEdad("24/09/1968", "24/09/2023")
//    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
//    edad = calcularEdad("24/09/1968", "23/09/2023")
//    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
//    edad = calcularEdad("24/09/2020", "24/09/2023")
//    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
//}