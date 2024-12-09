fun main (){
    val num_veces= readln().toInt()
    for (i in 1..num_veces){
        val sudoku=mutableListOf<MutableList<Int>>()
//        Según numero propios son 27 coincidencias en total 9 por criterio individual
        var contador_filas=0
        var contador_columnas=0
        var contador_cuadrados=0
//        Crea el sudoku
        for (j in 1..9){
            val linea= readln().split(" ")
            val linea_temporal= mutableListOf<Int>()
            for (k in linea){
                linea_temporal.add(k.toString().toInt())
            }
            sudoku.add(linea_temporal)
        }
//        Lectura fila
        for (j in sudoku) {
            var contador = 0
            for (k in 0..9) {
                if (k in j) {
                    contador++
                }
            }
            if (contador==9) {
                contador_filas++
            }
        }
        if (contador_filas!=9){
            println("NO")
            continue
        }


        //        Lectura columna
        for (j in 0 until 9) {
            val lista_columa= mutableListOf<Int>()
            var contador = 0
            for (k in 0 until 9) {
                lista_columa.add(sudoku[k][j])
            }
            for (k in 1 .. 9) {
                if (k in lista_columa){
                    contador++
                }
            }
            if (contador==9) {
                contador_columnas++
            }
        }

        if (contador_columnas!=9){
            println("NO")
            continue
        }

//        Generacion del cuadro y comprobación numeros

        for (j in 0 until 9 step 3) {
            for (k in 0 until 9 step 3){
                val lista_cuadra= mutableListOf<Int>()
                // Agregamos los valores de cada bloque 3x3 (Cortesia de chat gpt)
                lista_cuadra.add(sudoku[j][k])     // Primer fila, primer columna
                lista_cuadra.add(sudoku[j][k + 1]) // Primer fila, segunda columna
                lista_cuadra.add(sudoku[j][k + 2]) // Primer fila, tercera columna

                lista_cuadra.add(sudoku[j + 1][k]) // Segunda fila, primer columna
                lista_cuadra.add(sudoku[j + 1][k + 1]) // Segunda fila, segunda columna
                lista_cuadra.add(sudoku[j + 1][k + 2]) // Segunda fila, tercera columna

                lista_cuadra.add(sudoku[j + 2][k]) // Tercera fila, primer columna
                lista_cuadra.add(sudoku[j + 2][k + 1]) // Tercera fila, segunda columna
                lista_cuadra.add(sudoku[j + 2][k + 2]) // Tercera fila, tercera columna

                var contador=0
                for (z in 1..9) {
                    if (z in lista_cuadra) {
                        contador++
                    }
                }
                if (contador==9) {
                    contador_cuadrados++
                }
            }
        }
        if (contador_cuadrados!=9) {
            println("NO")
            continue
        }
        println("SI")



    }
}