// Controla el descubrimiento del mapa
fun descubrir_mapa2(x:Int, y:Int, tablero: MutableList<StringBuilder>):Boolean {
//    Control de limites
    if (x !in tablero.indices || y !in tablero[x].indices) return false
//    no eres casilla sin probar
    if (tablero[x][y]!='-')return false

    tablero[x][y]=comprobar_alrededor(x,y,tablero)

    if (tablero[x][y]==' '){
        //    arriba-izquierda
        if (x - 1 in tablero.indices && y - 1 in tablero[x].indices) {
            descubrir_mapa(x - 1, y - 1, tablero)
        }

//    arriba
        if (x - 1 in tablero.indices && y in tablero[x].indices) {
            descubrir_mapa(x - 1, y, tablero)
        }

//    arriba-derecha
        if (x - 1 in tablero.indices && y + 1 in tablero[x].indices) {
            descubrir_mapa(x - 1, y + 1, tablero)
        }

//    izquierda
        if (x in tablero.indices && y - 1 in tablero[x].indices) {
            descubrir_mapa(x, y - 1, tablero)
        }

//    derecha
        if (x in tablero.indices && y + 1 in tablero[x].indices) {
            descubrir_mapa(x, y + 1, tablero)
        }

//    abajo-izquierda
        if (x + 1 in tablero.indices && y - 1 in tablero[x].indices) {
            descubrir_mapa(x + 1, y - 1, tablero)
        }

//    abajo
        if (x + 1 in tablero.indices && y in tablero[x].indices) {
            descubrir_mapa(x + 1, y, tablero)
        }

//    abajo-derecha
        if (x + 1 in tablero.indices && y + 1 in tablero[x].indices) {
            descubrir_mapa(x + 1, y + 1, tablero)
        }
   }



    return false
}
//Controla las minas alrededor de una posicon dada. Si alguna casilla
// el numero de minas no coincide con el esperado esta aqui el
// problema ya ha sucedido
fun comprobar_alrededor2(x:Int, y:Int, tablero:MutableList<StringBuilder>):Char {
    var contador_minas= 0
//    superior izquierda
    if (x-1 in tablero.indices && y-1 in tablero[x].indices && tablero[x-1][y-1]=='*') {
        contador_minas++
    }
    //    superior
    if (x - 1 in tablero.indices && y in tablero[x].indices && tablero[x - 1][y] == '*') {
        contador_minas++
    }

//    superior derecha
    if (x - 1 in tablero.indices && y + 1 in tablero[x].indices && tablero[x - 1][y + 1] == '*') {
        contador_minas++
    }

//    izquierda
    if (x in tablero.indices && y - 1 in tablero[x].indices && tablero[x][y - 1] == '*') {
        contador_minas++
    }

//    derecha
    if (x in tablero.indices && y + 1 in tablero[x].indices && tablero[x][y + 1] == '*') {
        contador_minas++
    }

//    inferior izquierda
    if (x + 1 in tablero.indices && y - 1 in tablero[x].indices && tablero[x + 1][y - 1] == '*') {
        contador_minas++
    }

//    inferior
    if (x + 1 in tablero.indices && y in tablero[x].indices && tablero[x + 1][y] == '*') {
        contador_minas++
    }

//    inferior derecha
    if (x + 1 in tablero.indices && y + 1 in tablero[x].indices && tablero[x + 1][y + 1] == '*') {
        contador_minas++
    }
    return if (contador_minas!=0) {
        contador_minas.toString().first()
    }
    else {
        ' '
    }

}
fun main() {
//    Variables de entrada
    var entrada= readlnOrNull()

    while (entrada!=null) {
//        Variables definidas dentro de while
        var f=entrada.split(" ")[0].toInt()
        var c=entrada.split(" ")[1].toInt()
        var boom=false
        val tablero= mutableListOf<StringBuilder>()

//        Bucle que introduce las lineas del tablero
        for (i in 1..f) {
            val linea= readln()
            val linea_modificable=StringBuilder(linea)
            tablero.add(linea_modificable)
        }

//        Controla el numero de posicones pulsada en tablero
        val num_veces= readln().toInt()
        for (i in 1..num_veces){
            val posicion= readln().split(" ")
            val posicion_x=posicion[0].toInt()-1
            val posicion_y=posicion[1].toInt()-1
            if (tablero[posicion_x][posicion_y]=='*'){
                boom=true
            }
            descubrir_mapa(posicion_x, posicion_y,tablero)
        }

//        Una serie de modificaciones
        for (i in tablero.indices) {
            var nueva_linea=tablero[i].toString()
            nueva_linea=nueva_linea.replace('-','X')
            nueva_linea=nueva_linea.replace('*','X')
            nueva_linea=nueva_linea.replace(' ','-')
            tablero[i]=StringBuilder(nueva_linea)
        }

//        Controla si has dado en una mina o no
        if (boom) {
            println("GAME OVER")
        }
        else {
            for (i in tablero) {
                println(i)
            }
        }



        entrada= readlnOrNull()
    }
}