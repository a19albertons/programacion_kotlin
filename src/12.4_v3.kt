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
        for (i in tablero.indices){
            for (j in tablero[i].indices){
                if (tablero[i][j]=='*'){
                    if (i - 1 in tablero.indices && j - 1 in tablero[i].indices && tablero[i-1][j-1] == '-' ){
                        tablero[i-1][j-1]='+'
                    }
                    if (i - 1 in tablero.indices && j in tablero[i - 1].indices && tablero[i - 1][j] == '-') {
                        tablero[i - 1][j] = '+'
                    }
                    if (i - 1 in tablero.indices && j + 1 in tablero[i - 1].indices && tablero[i - 1][j + 1] == '-') {
                        tablero[i - 1][j + 1] = '+'
                    }
                    if (i in tablero.indices && j - 1 in tablero[i].indices && tablero[i][j - 1] == '-') {
                        tablero[i][j - 1] = '+'
                    }
                    if (i in tablero.indices && j + 1 in tablero[i].indices && tablero[i][j + 1] == '-') {
                        tablero[i][j + 1] = '+'
                    }
                    if (i + 1 in tablero.indices && j - 1 in tablero[i + 1].indices && tablero[i + 1][j - 1] == '-') {
                        tablero[i + 1][j - 1] = '+'
                    }
                    if (i + 1 in tablero.indices && j in tablero[i + 1].indices && tablero[i + 1][j] == '-') {
                        tablero[i + 1][j] = '+'
                    }
                    if (i + 1 in tablero.indices && j + 1 in tablero[i + 1].indices && tablero[i + 1][j + 1] == '-') {
                        tablero[i + 1][j + 1] = '+'
                    }
                }
            }
        }


//        Alias contamos sombras
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