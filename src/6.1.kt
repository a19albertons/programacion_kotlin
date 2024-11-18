fun main() {
    var numero = readlnOrNull()
    while (numero!= null) {
        var numero_int = numero.toInt()
        if (numero_int==0 || numero_int>=1000) {
            println()
        }
        else if (numero_int%2==0) {
            println("DERECHA")
        }
        else {
            println("IZQUIERDA")
        }
        numero = readlnOrNull()
    }
}