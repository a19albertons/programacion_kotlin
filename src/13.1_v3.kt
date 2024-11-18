fun sumarVecinos(tablero: List<List<Int>>, i: Int, j: Int): Int {
    var sumar=0
//    Rediseño del sistema de recorrido
//    y comprobación de casillas colindantes
    if (i-1 in tablero.indices && j-1 in tablero[0].indices) {
        sumar+=tablero[i-1][j-1]
    }
    if (i-1 in tablero.indices && j in tablero[0].indices) {
        sumar+=tablero[i-1][j]
    }
    if (i-1 in tablero.indices && j+1 in tablero[0].indices) {
        sumar += tablero[i-1][j+1]
    }
    if (i in tablero.indices && j-1 in tablero[0].indices) {
        sumar += tablero[i][j-1]
    }
    if (i in tablero.indices && j+1 in tablero[0].indices) {
        sumar += tablero[i][j+1]
    }
    if (i+1 in tablero.indices && j-1 in tablero[0].indices) {
        sumar += tablero[i+1][j-1]
    }
    if (i+1 in tablero.indices && j in tablero[0].indices) {
        sumar += tablero[i+1][j]
    }
    if (i+1 in tablero.indices && j+1 in tablero[0].indices) {
        sumar += tablero[i+1][j+1]
    }



    return sumar
}

fun main() {
    val matriz = listOf(
        listOf(2, 1, 3),
        listOf(4, 1, 0),
        listOf(1, 2, 1)
    )

    println(sumarVecinos(matriz, 1, 1))
    println(sumarVecinos(matriz, 0, 0))
    println(sumarVecinos(matriz, 2, 2))
}