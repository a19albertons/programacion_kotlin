fun main() {
    var num_lineas = readlnOrNull()
    while (num_lineas!=null) {
        val posiciones= readln()
        val posiciones_lista=posiciones.split(" ")
        val num_lineas_lista=num_lineas.split(" ")
//        Generera un tablero relleno de 0
        val tablero= Array(num_lineas_lista[0].toString().toInt())
        {Array(num_lineas_lista[1].toString().toInt()) { '0' }}

//        Añadir minas
        for (i in posiciones_lista.indices step 2) {
            val posiciones1=posiciones_lista[i]
            val posiciones2=posiciones_lista[i+1]
            tablero[posiciones1.toString().toInt()][posiciones2.toString().toInt()]='9'
        }
//        Empezamos a contabilizar las minas alrededor de cada casilla
        for (i in tablero.indices) {
            for (j in tablero.indices) {
                if (tablero[i][j]=='0') {
                    var nuevo_valor=0
                    if (i-1 in tablero.indices && j-1 in tablero.indices) {
                        if (tablero[i-1][j-1]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i-1 in tablero.indices && j in tablero.indices) {
                        if (tablero[i-1][j]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i-1 in tablero.indices && j+1 in tablero.indices) {
                        if (tablero[i-1][j+1]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i in tablero.indices && j-1 in tablero.indices) {
                        if (tablero[i][j-1]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i in tablero.indices && j+1 in tablero.indices) {
                        if (tablero[i][j+1]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i+1 in tablero.indices && j-1 in tablero.indices) {
                        if (tablero[i+1][j-1]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i+1 in tablero.indices && j in tablero.indices) {
                        if (tablero[i+1][j]=='9'){
                            nuevo_valor++
                        }
                    }
                    if (i+1 in tablero.indices && j+1 in tablero.indices) {
                        if (tablero[i+1][j+1]=='9'){
                            nuevo_valor++
                        }
                    }
                    val nuevo_valor_char=nuevo_valor.toString().first()
                    tablero[i][j]=nuevo_valor_char
                }

            }

        }


        for (i in tablero.indices) {
            for (j in tablero[0].indices) {
                print(tablero[i][j]+" ")
            }
            println()
        }
        println("------------------------------------")




        num_lineas= readlnOrNull()
    }
}