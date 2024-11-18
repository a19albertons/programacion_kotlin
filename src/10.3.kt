fun main() {
    var entrada = readlnOrNull()
    while (entrada!=null) {
        val array=entrada.split("")
        val resultado= arrayOfNulls<String>(array.size)
        var posicion=0
        for (i in 1 until array.size) {
            val valor = array[i]
            when (valor) {
                "-" -> {
                    posicion=0
                }
                "+" -> {
                    posicion=resultado.lastIndex
                }
                "*" -> {
                    posicion+=1
                }
                "3" -> {
                    for (j in posicion+1 until resultado.size) {
                        resultado.set(j-1,resultado[j])
                    }

                }
                else -> {
//                    Estructura que controla el empuje hacia adelante
//                    de los caracteres cuadno te encuentras casos
//                    distintos a nulo donde vayass poner caracter
                    if (resultado[posicion]!=null) {
                        for (j in resultado.size-2 downTo  posicion) {
                            resultado.set(j+1,resultado[j])
                        }
                        resultado.set(posicion,valor)
                        posicion+=1
                    }
                    else {
                        resultado.set(posicion,valor)
                        posicion+=1
                    }

                }

            }
        }
        for (i in 0 until resultado.size) {
            if (resultado[i]!=null)
                print(resultado[i])
        }
        println()



        entrada= readlnOrNull()
    }
}