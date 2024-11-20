fun main(){
    var entrada= readlnOrNull()
    while (entrada!=null){
//        Definimos lineas y columnas
        val f=entrada.split(" ")[0].toInt()
        val c=entrada.split(" ")[1].toInt()
//        Creamos la plantilla del tablero
        val tablero= mutableListOf<StringBuilder>()

//        Añadimos las strings al tablero
        for (i in 1..f) {
            val linea= readln()
            val linea_modificable=StringBuilder(linea)
            tablero.add(linea_modificable)
        }
//        Sacamos la celda de salida
        var x=0
        var y=0
        for (i in tablero.indices){
            for (j in tablero[i].indices) {
                if (tablero[i][j]=='S'){
                    x=i
                    y=j
                }
            }
        }
        val resultado=alcolmilenario(x,y,tablero)
        if (resultado) {
            println("SI")
        }
        else {
            println("NO")
        }
        entrada= readlnOrNull()
    }
}
fun alcolmilenario(x: Int, y:Int, tablero: MutableList<StringBuilder>): Boolean{
//    No esta dentro de rango
    if (x !in tablero.indices || y !in tablero[x].indices) return false
//    Es un asteriode u otra marca futura
    if (tablero[x][y]=='*'
        || tablero[x][y]=='+') return false
//    Es la F
    if (tablero [x][y]=='F') return true

//    aplicacion del + pasamos por la casilla
    tablero[x][y]='+'

//    Moverse
//    Arriba
    if (alcolmilenario(x+1,y, tablero)) return true
//    derecha
    if (alcolmilenario(x,y+1, tablero)) return true
//    Abajo
    if (alcolmilenario(x-1,y, tablero)) return true
//    izquierda
    if (alcolmilenario(x,y-1, tablero)) return true

    return false
}