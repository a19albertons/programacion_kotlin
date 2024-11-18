fun main() {
    var original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', '*', '*')
    )
    imprimirFiguras(original, getSimetrica(original))

    original = arrayOf(
        charArrayOf(' ', '*',' ',' '),
        charArrayOf('*', '*','*','*'),
        charArrayOf(' ', '*',' ',' ')
    )
    imprimirFiguras(original, getSimetrica(original))
    original = arrayOf(
        charArrayOf('*', ' ', ' '),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', '*'),
        charArrayOf('*', '*', ' '),
        charArrayOf('*', ' ', ' '),
    )
    imprimirFiguras(original, getSimetrica(original))
}

fun getSimetrica2(original: Array<CharArray>): MutableList<MutableList<Char>> {
    val tablero= mutableListOf<MutableList<Char>>()
    for (i in 0..original.lastIndex){
        val lista_temporal= mutableListOf<Char>()
        for (j in original[0].lastIndex downTo 0) {
            lista_temporal.add(original[i][j])
        }
        tablero.add(lista_temporal)
    }


    return tablero
}

fun imprimirFiguras2(original: Array<CharArray>, simetrica: MutableList<MutableList<Char>>) {
    for (i in 0..original.lastIndex) {
        for (j in 0..original[i].lastIndex) {
            print(original[i][j]+" ")
        }
        for (j in 0..simetrica[i].lastIndex) {
            print(simetrica[i][j]+" ")
        }
        println()
    }
    println()
}
