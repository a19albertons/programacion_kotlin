fun pintarpiscina(x: Int, y: Int, tablero: MutableList<StringBuilder>): Boolean {
//    Fuera de indice
    if (x !in tablero.indices || y !in tablero[x].indices) return false
//        Es tabique
    if (tablero[x][y]=='T'
        || tablero[x][y]=='R') return false

    tablero[x][y]='R'

//    Arriba
    if (pintarpiscina(x-1,y,tablero)) return true
    //derecha
    if (pintarpiscina(x,y+1, tablero)) return true
    //abajo
    if (pintarpiscina(x+1,y,tablero)) return true
//    izquierda
    if (pintarpiscina(x,y-1,tablero)) return true


    return false
}
fun main() {
    var entrada= readln()
    while (entrada!="0 0"){
//        Creacion filas columnas
        val f=entrada.split(" ")[0].toInt()
        val c=entrada.split(" ")[1].toInt()
//        Creacion tablero
        val tablero= mutableListOf<StringBuilder>()
//        Relleno tablero
        for (i in 1..f) {
            val linea= readln()
            val linea_modificable=StringBuilder(linea)
            tablero.add(linea_modificable)
        }

//        Lanzamiento y ubicacion
        val lanzamiento= readln()
        val f_lanzamiento=lanzamiento.split(" ")[0].toInt()
        val c_lanzamiento=lanzamiento.split(" ")[1].toInt()

        if (tablero[f_lanzamiento][c_lanzamiento]=='T') {
            for (i in tablero.indices){
                println(tablero[i])
            }
        }
        else {
            pintarpiscina(f_lanzamiento, c_lanzamiento,tablero)
            for (i in tablero.indices){
                println(tablero[i])
            }
        }



        println("---------------------------------------------")
        entrada= readln()
    }
}