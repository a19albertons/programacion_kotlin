fun main(){
    var numero= readln()
    while (numero != "0 0") {
//        Variable para procesar numeros y contorlar su conversion en una lista
        val lista_numeros=numero.split(" ")
        val valor1=lista_numeros[0].toList()
        val valor2=lista_numeros[1].toList()
        val valor1_lista = mutableListOf<Int>()
        val valor2_lista = mutableListOf<Int>()
        var numero_añadidor:Int =0

//        Bucles que generan que reconvierten la lista a int
        for (i in valor1.size-1 downTo 0) {
            if (valor1.size-1>=i) {
                when (valor1[i].code) {
                    48 -> numero_añadidor = 0
                    49 -> numero_añadidor = 1
                    50 -> numero_añadidor = 2
                    51 -> numero_añadidor = 3
                    52 -> numero_añadidor = 4
                    53 -> numero_añadidor = 5
                    54 -> numero_añadidor = 6
                    55 -> numero_añadidor = 7
                    56 -> numero_añadidor = 8
                    57 -> numero_añadidor = 9
                }
            }
            else {
                numero_añadidor=0
            }
            valor1_lista.add(0,numero_añadidor)
        }
        for (i in valor2.size-1 downTo 0) {
            if (valor2.size-1>=i) {
                when (valor2[i].code) {
                    48 -> numero_añadidor = 0
                    49 -> numero_añadidor = 1
                    50 -> numero_añadidor = 2
                    51 -> numero_añadidor = 3
                    52 -> numero_añadidor = 4
                    53 -> numero_añadidor = 5
                    54 -> numero_añadidor = 6
                    55 -> numero_añadidor = 7
                    56 -> numero_añadidor = 8
                    57 -> numero_añadidor = 9
                }
            }
            else {
                numero_añadidor=0
            }

            valor2_lista.add(0,numero_añadidor)
        }

//        Controla la igualación de posiciones entre las listas
        if (valor1.size>valor2.size) {
            for (i in valor2.size until valor1.size) {
                valor2_lista.add(0,0)
            }
        }
        else {
            for (i in valor1.size until valor2.size) {
                valor1_lista.add(0,0)
            }
        }



//        Compara posición
        var j=0
        var z=0
        for (i in valor1_lista.lastIndex downTo 0) {
            val valor1_int = valor1_lista[i]
            val valor2_int = valor2_lista[i]
            val comparar = valor1_int + valor2_int + j
            if (comparar >= 10) {
                j = 1
                z += 1
            } else {
                j = 0
            }
        }
        println(z)


        numero= readln()
    }
}