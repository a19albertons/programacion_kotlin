fun juego_de_reinas(k: Int, l:Int, tablero: MutableList<MutableList<Char>>): Boolean{
    //    Controla el exceso hacia derecha
    if (l == tablero.size) return false

    // Si excedes hacia abajo se supone que va todo bien
    if (k == tablero.size ) return true

//    Si reina no es valida vamos la quitamos y vamos para la derecha
    if (!comprobador_reina(k,l,tablero)){
//        tablero[k][l]='.'
        if (juego_de_reinas(k,l+1,tablero)) return true
    }
    else {
        tablero[k][l]='Q'
        if (juego_de_reinas(k+1,0,tablero)) return true
    }
//    Si lo anterior da a un callejon sin mandamos para la derecha una posción
    tablero[k][l]='.'
    if (juego_de_reinas(k,l+1,tablero)) return true
    return false
}

//Lo que esta comentado de bucles es "optimización"
fun  comprobador_reina(i:Int, j:Int, tablero: MutableList<MutableList<Char>>): Boolean{
//    Arriba-izquierda
    var devolver=true
    var contador= 1

    //    arriba
    while (devolver==true && i-contador in tablero.indices){
//        arriba izquierda
        if (j-contador in tablero[i-contador].indices && tablero[i-contador][j-contador]=='Q') {
            devolver=false
        }
//        arriba
        if (tablero[i-contador][j]=='Q') {
            devolver=false
        }
//        arriba derecha
        if (j+contador in tablero[i-contador].indices && tablero[i-contador][j+contador]=='Q') {
            devolver=false
        }
        contador++
    }
    return devolver
}

fun main () {
    var entrada= readln().toInt()
    while (entrada!=0) {
//        Creacion de tablero
//        Posiciones base más a la izquierda
        val y=0
        for (x in 0 until entrada) {


            val tablero =MutableList(entrada) {MutableList(entrada){'.'}}

            if (juego_de_reinas(x,y,tablero)) {
                for (i in tablero.indices){
                    for (j in tablero[i].indices){
                        print(tablero[i][j]+"  ")
                    }
                    println()
                }
                println("========================================")
//                Llamesele optimización
                break
            }

        }
//        print(entrada)

        entrada= readln().toInt()
    }
}