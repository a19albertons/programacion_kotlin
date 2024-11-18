fun sumarVecinos3(tablero: List<List<Int>>, i: Int, j: Int): Int {
    var sumar=0
//    Centro
    if (i in 1..tablero.size-2 && j in 1..tablero.size) {
        sumar+=tablero[i-1][j-1]
        sumar+=tablero[i-1][j]
        sumar+=tablero[i-1][j+1]
        sumar+=tablero[i][j-1]
        sumar+=tablero[i][j+1]
        sumar+=tablero[i+1][j-1]
        sumar+=tablero[i+1][j]
        sumar+=tablero[i+1][j+1]
    }
//    Esquina superior izquierda
    if (i == 0 && j == 0) {
        sumar+=tablero[i][j+1]
        sumar+=tablero[i+1][j]
        sumar+=tablero[i+1][j+1]
    }
    //    esquina inferior derecha
    if (i == tablero.lastIndex && j == tablero[0].lastIndex) {
        sumar+=tablero[i-1][j-1]
        sumar+=tablero[i-1][j]
        sumar+=tablero[i][j-1]

    }
//    Esquina superior derecha
    if (i ==0 && j == tablero[0].lastIndex) {
        sumar+=tablero[i][j-1]
        sumar+=tablero[i+1][j-1]
        sumar+=tablero[i+1][j]
    }
//    Esquina inferior izquierda
    if (i ==tablero.lastIndex && j == 0) {
        sumar+=tablero[i-1][j]
        sumar+=tablero[i-1][j+1]
        sumar+=tablero[i][j+1]
    }
//    Borde superior
    if (i ==0 && j in 1..tablero.size-2) {
        sumar+=tablero[i][j-1]
        sumar+=tablero[i][j+1]
        sumar+=tablero[i+1][j-1]
        sumar+=tablero[i+1][j]
        sumar+=tablero[i+1][j+1]
    }
//    Borde inferior
    if (i == tablero.lastIndex && j in 1..tablero.size-2) {
        sumar+=tablero[i-1][j-1]
        sumar+=tablero[i-1][j]
        sumar+=tablero[i-1][j+1]
        sumar+=tablero[i][j-1]
        sumar+=tablero[i][j+1]
    }
//    Borde derecho
    if (i in 1..tablero.size-2 && j == tablero.lastIndex) {
        sumar+=tablero[i-1][j-1]
        sumar+=tablero[i-1][j]
        sumar+=tablero[i][j-1]
        sumar+=tablero[i+1][j-1]
        sumar+=tablero[i+1][j]
    }
//    Borde izquierdo
    if (i in 1..tablero.size-2 && j ==0) {
        sumar+=tablero[i-1][j]
        sumar+=tablero[i-1][j+1]
        sumar+=tablero[i][j+1]
        sumar+=tablero[i+1][j]
        sumar+=tablero[i+1][j+1]
    }

    return sumar
}

