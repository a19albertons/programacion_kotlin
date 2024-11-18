fun main() {
//    Pide la variable base
    var entrada = readln()
    while (true) {
//        Inicializa el contador
        var total = 0.0

//        Analiza la entrada caracter por caracter
//        Despues suma los puntos de cada caracter valido
        for (item in entrada) {
            when (item) {
                'N' -> total = total + 1.00
                'B' -> total = total + 2.00
                'R' -> total = total + 4.00
                'C' -> total = total + 0.5
                'S' -> total = total + 0.25
            }
        }

//      Chequea los puntos totales con los criterios
        when {
            total < 4.0 -> println("DEFECTO")
            total > 4.0 -> println("EXCESO")
            else -> println("CORRECTO")
        }

//        Pide la entrada nuevamente y chequea si pone fin
        entrada = readln()
        if (entrada == "FIN") {
            break
        }
    }
}