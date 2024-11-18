fun main() {
    var entrada= readlnOrNull()
    while (entrada!=null) {
        val listra_entrada=entrada.split(" ")
        val linea_X=listra_entrada[0]
        val linea_Y=listra_entrada[1]
        val raton_X=listra_entrada[2]
        val raton_Y=listra_entrada[3]
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
//        Nota tener en cuenta el -1 para compensar el empezar en 0
        tablero[raton_X.toString().toInt()-1][raton_Y.toString().toInt()-1]='R'
        //Casos normales esperados
        if (tablero.size!=1&&tablero[0].size!=1) {
            //        Abajo derecha
            if (raton_X.toString().toInt()-1==tablero.lastIndex && raton_Y.toString().toInt()-1==tablero[0].lastIndex) {
                tablero[tablero.lastIndex][tablero[0].lastIndex-1]='G'
                tablero[tablero.lastIndex-1][tablero[0].lastIndex-1]='G'
                tablero[tablero.lastIndex-1][tablero[0].lastIndex]='G'
            }
            //arriba izquierda
            if (raton_X.toString().toInt()-1==0&& raton_Y.toString().toInt()-1==0){
                tablero[0][0+1]='G'
                tablero[0+1][0+1]='G'
                tablero[0+1][0]='G'
            }
//        centro
            if (raton_X.toString().toInt()-1!=tablero.lastIndex&&
                raton_X.toString().toInt()-1!=0&&
                raton_Y.toString().toInt()-1!=tablero.lastIndex&&
                raton_Y.toString().toInt()-1!=0){
                tablero[raton_X.toString().toInt()-1 - 1][raton_Y.toString().toInt()-1 - 1] = 'G'  // Arriba-Izquierda
                tablero[raton_X.toString().toInt()-1 - 1][raton_Y.toString().toInt()-1] = 'G'      // Arriba
                tablero[raton_X.toString().toInt()-1 - 1][raton_Y.toString().toInt()-1 + 1] = 'G'  // Arriba-Derecha
                tablero[raton_X.toString().toInt()-1][raton_Y.toString().toInt()-1 - 1] = 'G'      // Izquierda
                tablero[raton_X.toString().toInt()-1][raton_Y.toString().toInt()-1 + 1] = 'G'      // Derecha
                tablero[raton_X.toString().toInt()-1 + 1][raton_Y.toString().toInt()-1 - 1] = 'G'  // Abajo-Izquierda
                tablero[raton_X.toString().toInt()-1 + 1][raton_Y.toString().toInt()-1] = 'G'      // Abajo
                tablero[raton_X.toString().toInt()-1 + 1][raton_Y.toString().toInt()-1 + 1] = 'G'  // Abajo-Derecha
            }
//            Borde derecho
            if (tablero.lastIndex!=raton_X.toString().toInt()-1&&
                raton_X.toString().toInt()-1!=0&&
                raton_Y.toString().toInt()-1==tablero[0].lastIndex) {
                tablero[raton_X.toString().toInt()-1 - 1][raton_Y.toString().toInt()-1 - 1] = 'G'  // Arriba-Izquierda
                tablero[raton_X.toString().toInt()-1 - 1][raton_Y.toString().toInt()-1] = 'G'      // Arriba
                tablero[raton_X.toString().toInt()-1][raton_Y.toString().toInt()-1 - 1] = 'G'      // Izquierda
                tablero[raton_X.toString().toInt()-1 + 1][raton_Y.toString().toInt()-1 - 1] = 'G'  // Abajo-Izquierda
                tablero[raton_X.toString().toInt()-1 + 1][raton_Y.toString().toInt()-1] = 'G'      // Abajo
            }
//        Quedan por hacer los bordes (excepto el derecho) y 2 esquinas por motivos de tiempo y requirimientos de las pruebas unitarias aún no se hacen
        }
//        Primer escenario de casos no esperados especiales (una sola altura)
        else if (tablero.size==1 && tablero[0].size!=1) {
            if (raton_Y.toString().toInt()-1==0) {
                tablero[0][raton_Y.toString().toInt()-1+1]='G'
            }
//            Quedaría controlar el caso de que estuviese en el centor o el final todavía
        }
//        Faltaria otro caso especial que sería el de solo alturas sin anchos


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