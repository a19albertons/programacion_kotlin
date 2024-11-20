fun hayCamino(i: Int, j: Int, laberinto: List<MutableList<Char>>): String {
    var ruta = mutableListOf<String>()
    var resultado=""
    hayCamino2(i,j,laberinto,ruta)
    for (i in ruta){
        resultado=resultado+i
    }
    return resultado
}
fun hayCamino2(i: Int, j:Int, laberinto: List<MutableList<Char>>, ruta: MutableList<String>): Boolean {

//    Fuera de indices
    if (i !in laberinto.indices || j !in laberinto[i].indices) return false
//    Es un muro/pared (no transitable)
    if (laberinto[i][j] == '#'  ||
        laberinto[i][j] == '.') return false
    //    Es el objetivo
    ruta.add("($i,$j)")
    if (laberinto[i][j]=='Q') return true

    laberinto[i][j]='.'


    //    arriba
    if (hayCamino2(i-1,j,laberinto, ruta)) return true
    //    derecha
    if (hayCamino2(i,j+1,laberinto,ruta)) return true
    //Bajamos
    if (hayCamino2(i+1, j, laberinto,ruta)) return true
//    izquierda
    if (hayCamino2(i,j-1,laberinto,ruta)) return true

    ruta.removeLast()
    return false
}
