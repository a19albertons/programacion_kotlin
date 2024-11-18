fun main() {
    var entrada = readlnOrNull()
    while (entrada != null) {
        val array = entrada.toCharArray()
        val resultado = arrayOfNulls<String>(array.size)
        var posicion = 0

        for (valor in array) {
            when (valor) {
                '-' -> posicion = 0 // Reinicia la posición al inicio del array.
                '+' -> posicion = resultado.indexOfLast { it != null }.takeIf { it >= 0 } ?: resultado.lastIndex // Al final ocupado o el último índice.
                '*' -> {
                    if (posicion < resultado.lastIndex) posicion += 1 // Incrementa posición, pero sin pasar el límite.
                }
                '3' -> {
                    if (posicion in resultado.indices) {
                        resultado[posicion] = null // Borra el valor en la posición actual
                    }
                }
                else -> {
                    if (posicion in resultado.indices) {
                        resultado[posicion] = valor.toString() // Inserta el valor en la posición actual
                        posicion += 1 // Avanza posición tras la inserción.
                    }
                }
            }
        }

        // Imprimir el resultado final sin posiciones nulas
        resultado.filterNotNull().forEach { print(it) }
        println() // Nueva línea después de cada entrada procesada

        entrada = readlnOrNull()
    }
}
