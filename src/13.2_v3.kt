fun main() {
    var entrada= readlnOrNull()
    while (entrada!=null) {
        val listra_entrada=entrada.split(" ")
        val linea_X=listra_entrada[0]
        val linea_Y=listra_entrada[1]
        val raton_X=listra_entrada[2]
        val raton_Y=listra_entrada[3]
        val raton_X_corregido=raton_X.toString().toInt()-1
        val raton_Y_corregido=raton_Y.toString().toInt()-1
        val tablero=mutableListOf<MutableList<Char>>()
//        Crea el tablero
        for (i in 1..linea_X.toString().toInt()) {
            val lista_temporal= mutableListOf<Char>()
            for (j in 1..linea_Y.toString().toInt()) {
                lista_temporal.add('X')
            }
            tablero.add(lista_temporal)
        }
//        Añade al raton.
        tablero[raton_X_corregido][raton_Y_corregido]='R'

//      Rediseño total de los criterios de marcación de donde poner el gato
        for (i in tablero.indices) {
            for (j in tablero[0].indices)  {
                if (tablero[i][j]=='R') {
                    if (i-1 in tablero.indices && j-1 in tablero[0].indices) {
                        tablero[i-1][j-1]='G'
                    }
                    if (i-1 in tablero.indices && j in tablero[0].indices) {
                        tablero[i-1][j]='G'
                    }
                    if (i-1 in tablero.indices && j+1 in tablero[0].indices) {
                        tablero[i-1][j+1]='G'
                    }
                    if (i in tablero.indices && j-1 in tablero[0].indices) {
                        tablero[i][j-1]='G'
                    }
                    if (i in tablero.indices && j+1 in tablero[0].indices) {
                        tablero[i][j+1]='G'
                    }
                    if (i+1 in tablero.indices && j-1 in tablero[0].indices) {
                        tablero[i+1][j-1]='G'
                    }
                    if (i+1 in tablero.indices && j in tablero[0].indices) {
                        tablero[i+1][j]='G'
                    }
                    if (i+1 in tablero.indices && j+1 in tablero[0].indices) {
                        tablero[i+1][j+1]='G'
                    }
                }
            }
        }

        //imprime el tablero
        for (i in 0..tablero.lastIndex){
            for (j in 0..tablero[0].lastIndex) {
                print("["+tablero[i][j]+"]")
            }
            println()
        }
        println()

        entrada= readlnOrNull()
    }
}