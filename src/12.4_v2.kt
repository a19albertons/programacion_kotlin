fun main(){
    var info_camping = readln()
    while (info_camping!="0 0 0"){
//        Logica de procesada de la entrada según lo entendido en enunciado
        val lista_info_camping=info_camping.split(" ")
        val alto=lista_info_camping[0].toInt()
        val ancho=lista_info_camping[1].toInt()
        val num_arboles=lista_info_camping[2].toInt()
        var sombras:String
        if (num_arboles!=0) {
            sombras= readln()
        }
        else {
            println("0")
            info_camping= readln()
            continue
        }
        var lista_sombras=sombras.split(" ")
//        Analizado los que nos pide y la image decidimos un sistema
        //        basado en el buscaminas donde casillas
        //        claras son -, arboles * y sombras +

//        Generamos el tablero con solo casillas claras
        val tablero= mutableListOf<MutableList<Char>>()
        for (i in 1..alto){
            val lista_añadir= mutableListOf<Char>()
            for (j in 1..ancho) {
                lista_añadir.add('-')

            }
            tablero.add(lista_añadir)
        }

//        Añadimo los arboles
        for (i in 0 until lista_sombras.size step 2) {
            tablero[lista_sombras[i].toInt()-1][lista_sombras[i+1].toInt()-1]='*'
        }
//        println(tablero)

//        Añadimos las sombras
//        Sombras centrales
        for (i in 1 .. tablero.size-2) {
            for (j in 1..tablero[i].size-2){
                var num_minas=0
                if (tablero[i][j]=='*') {
                    if (tablero[i-1][j-1]=='-') {
                        tablero[i-1][j-1]='+'
                    }
                    if (tablero[i-1][j] == '-') {
                        tablero[i-1][j] = '+'
                    }
                    if (tablero[i-1][j+1] == '-') {
                        tablero[i-1][j+1] = '+'
                    }
                    if (tablero[i][j-1] == '-') {
                        tablero[i][j-1] = '+'
                    }
                    if (tablero[i][j+1] == '-') {
                        tablero[i][j+1] = '+'
                    }
                    if (tablero[i+1][j-1] == '-') {
                        tablero[i+1][j-1] = '+'
                    }
                    if (tablero[i+1][j] == '-') {
                        tablero[i+1][j] = '+'
                    }
                    if (tablero[i+1][j+1] == '-') {
                        tablero[i+1][j+1] = '+'
                    }

                }
            }

        }
//        Esquinas
//        izquierda superior
        if (alto>1 && ancho>1) {
            if (tablero[0][0] == '*') {
                if (tablero[0][1] == '-') {
                    tablero[0][1] = '+'
                }
                if (tablero[1][0] == '-') {
                    tablero[1][0] = '+'
                }
                if (tablero[1][1] == '-') {
                    tablero[1][1] = '+'
                }
            }
            //        superior derecha
            if (tablero[0][ancho - 1] == '*') {
                if (tablero[0][ancho - 2] == '-') {
                    tablero[0][ancho - 2] = '+'
                }
                if (tablero[1][ancho - 1] == '-') {
                    tablero[1][ancho - 1] = '+'
                }
                if (tablero[1][ancho - 2] == '-') {
                    tablero[1][ancho - 2] = '+'
                }
            }
            //        izquierda inferior
            if (tablero[alto - 1][0] == '*') {
                if (tablero[alto - 1][1] == '-') {
                    tablero[alto - 1][1] = '+'
                }
                if (tablero[alto - 2][0] == '-') {
                    tablero[alto - 2][0] = '+'
                }
                if (tablero[alto - 2][1] == '-') {
                    tablero[alto - 2][1] = '+'
                }
            }
            //        superior derecha
            if (tablero[alto - 1][ancho - 1] == '*') {
                if (tablero[alto - 1][ancho - 2] == '-') {
                    tablero[alto - 1][ancho - 2] = '+'
                }
                if (tablero[alto - 2][ancho - 1] == '-') {
                    tablero[alto - 2][ancho - 1] = '+'
                }
                if (tablero[alto - 2][ancho - 2] == '-') {
                    tablero[alto - 2][ancho - 2] = '+'
                }
            }
            //        borde superior
            for (i in 1..ancho - 2) {
                if (tablero[0][i] == '*') {
                    if (tablero[0][i - 1] == '-') {
                        tablero[0][i - 1] = '+'
                    }
                    if (tablero[0][i + 1] == '-') {
                        tablero[0][i + 1] = '+'
                    }
                    if (tablero[0 + 1][i - 1] == '-') {
                        tablero[0 + 1][i - 1] = '+'
                    }
                    if (tablero[0 + 1][i] == '-') {
                        tablero[0 + 1][i] = '+'
                    }
                    if (tablero[0 + 1][i + 1] == '-') {
                        tablero[0 + 1][i + 1] = '+'
                    }
                }
            }
            //        borde superior
            for (i in 1..ancho - 2) {
                if (tablero[alto - 1][i] == '*') {
                    if (tablero[alto - 1 - 1][i - 1] == '-') {
                        tablero[alto - 1 - 1][i - 1] = '+'
                    }
                    if (tablero[alto - 1 - 1][i] == '-') {
                        tablero[alto - 1 - 1][i] = '+'
                    }
                    if (tablero[alto - 1 - 1][i + 1] == '-') {
                        tablero[alto - 1 - 1][i + 1] = '+'
                    }
                    if (tablero[alto - 1][i - 1] == '-') {
                        tablero[alto - 1][i - 1] = '+'
                    }
                    if (tablero[alto - 1][i + 1] == '-') {
                        tablero[alto - 1][i + 1] = '+'
                    }
                }
            }
            //        borde derecho
            for (j in 1..alto - 2) {
                if (tablero[j][ancho - 1] == '*') {
                    if (tablero[j - 1][ancho - 1 - 1] == '-') {
                        tablero[j - 1][ancho - 1 - 1] = '+'
                    }
                    if (tablero[j - 1][ancho - 1] == '-') {
                        tablero[j - 1][ancho - 1] = '+'
                    }
                    if (tablero[j][ancho - 1 - 1] == '-') {
                        tablero[j][ancho - 1 - 1] = '+'
                    }
                    if (tablero[j + 1][ancho - 1 - 1] == '-') {
                        tablero[j + 1][ancho - 1 - 1] = '+'
                    }
                    if (tablero[j + 1][ancho - 1] == '-') {
                        tablero[j + 1][ancho - 1] = '+'
                    }
                }
            }
            //        borde izquierdo
            for (j in 1..alto - 2) {
                if (tablero[j][0] == '*') {
                    if (tablero[j - 1][0] == '-') {
                        tablero[j - 1][0] = '+';
                    }
                    if (tablero[j - 1][0 + 1] == '-') {
                        tablero[j - 1][0 + 1] = '+';
                    }
                    if (tablero[j][0 + 1] == '-') {
                        tablero[j][0 + 1] = '+';
                    }
                    if (tablero[j + 1][0] == '-') {
                        tablero[j + 1][0] = '+';
                    }
                    if (tablero[j + 1][0 + 1] == '-') {
                        tablero[j + 1][0 + 1] = '+';
                    }
                }
            }
        }
        else if (alto>1){
//            superior izquierda
            if (tablero[0][0] == '*') {
                if (tablero[1][0] == '-') {
                    tablero[1][0] = '+'
                }
            }
            //        izquierda inferior
            if (tablero[alto - 1][0] == '*') {
                if (tablero[alto - 2][0] == '-') {
                    tablero[alto - 2][0] = '+'
                }
            }
            //        borde unico
            for (j in 1..alto - 2) {
                if (tablero[j][0] == '*') {
                    if (tablero[j - 1][0] == '-') {
                        tablero[j - 1][0] = '+';
                    }
                    if (tablero[j + 1][0] == '-') {
                        tablero[j + 1][0] = '+';
                    }
                }
            }
        }
        var mases=0
//        contar los +
//        println()
        for (i in 0 until tablero.size){
            for (j in tablero[i]){
                if (j == '+') {
                    mases++
                }
            }
//            Linea que sirve de debugger de lo hecho
//            println(tablero[i])
        }
        println(mases)



        info_camping= readln()
    }
}