import kotlin.system.exitProcess

fun elZorroEstuvoAqui2(altura:Int, caracter:Char) {
    if (altura in -3..3 ) {
        exitProcess(0)
    }
    if (altura>3) {
        val altura_compensado=altura-2

        for (item2 in 0 until altura_compensado) {
            print(caracter)
        }
        println()
        for (item in 1 .. altura_compensado) {
//        Gestiona la impresion de la primera linea

            for (espacio in item until altura_compensado) {
                print(" ")
            }
            print(caracter)
            println()
        }
        for (item2 in 0 until altura_compensado) {
            print(caracter)
        }
    }
    else {
        val altura_compensado=altura+2

        for (item2 in altura_compensado until 0 ) {
            print(caracter)
        }
        println()
        for (item in altura_compensado ..  -1 ) {
//        Gestiona la impresion de la primera linea

            for (espacio in altura_compensado until item) {
                print(" ")
            }
            print(caracter)
            println()
        }
        for (item2 in altura_compensado until  0 ) {
            print(caracter)
        }
    }
    println()
}
fun main() {
    val altura= readln().toInt()
    val caracter= readln().toString().first()
    elZorroEstuvoAqui(altura,caracter)
}