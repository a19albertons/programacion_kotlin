fun main() {
    var linea_tablero= readln()
    var ancho=linea_tablero.split(" ")[0].toInt()
    var alto=linea_tablero.split(" ")[1].toInt()
    while (ancho!=0 && alto!=0) {


        val campo_minas= mutableListOf<List<Char>>()
//        Añade todas las lineas a la lista multimodal
        for (i in 1..alto) {
            val entrada= readln().toList()
            campo_minas.add(entrada)
        }

//        Tras hacer simulaciones manuales observamos que las
//        esquinas son como mucho 3 casillas y cualquier otra
//        posición que estea en el borde 5 como maximo
        var num_minas_minimo_6=0
        for (i in 1 .. campo_minas.size-2) {
            for (j in 1..campo_minas[i].size-2){
                var num_minas=0
                if (campo_minas[i][j]=='-') {
                    if (campo_minas[i-1][j-1]=='*') {
                        num_minas++
                    }
                    if (campo_minas[i-1][j] == '*') {
                        num_minas++
                    }
                    if (campo_minas[i-1][j+1] == '*') {
                        num_minas++
                    }
                    if (campo_minas[i][j-1] == '*') {
                        num_minas++
                    }
                    if (campo_minas[i][j+1] == '*') {
                        num_minas++
                    }
                    if (campo_minas[i+1][j-1] == '*') {
                        num_minas++
                    }
                    if (campo_minas[i+1][j] == '*') {
                        num_minas++
                    }
                    if (campo_minas[i+1][j+1] == '*') {
                        num_minas++
                    }

                }
                if (num_minas>=6) {
                    num_minas_minimo_6+=1
                }
            }

        }
        println(num_minas_minimo_6)

        linea_tablero= readln()
        ancho=linea_tablero.split(" ")[0].toInt()
        alto=linea_tablero.split(" ")[1].toInt()
    }
}