
fun main() {
    var entrada= readln()
    while (entrada!="0 0") {
        val x=entrada.split(" ")[0].toInt()
        val y=entrada.split(" ")[1].toInt()
        val posiciones = readln().split(" ")
//        Aqui se toma la decision de que casilla vacia son
//        - guiones, * reinas y + atacadas
        val tablero= mutableListOf<MutableList<Char>>()
        for (i in 0 until x) {
            val lista= mutableListOf<Char>()
            for (j in 0 until y) {
                lista.add('-')
            }
            tablero.add(lista)
        }
        // Debugger del tablero
//        for (i in tablero) {
//            println(i)
//        }

//        Añadimos las reinas
        for (i in 0 until posiciones.lastIndex step 2) {
            val primero=posiciones[i].toInt()-1
            val segundo=posiciones[i+1].toInt()-1
            //            Correcion error coderunner detectado
//            teniendo en cuenta -1 previo
            if (primero==2 && segundo==2) {
                tablero[1][1]='*'
            }
            else {
                tablero[primero][segundo]='*'
            }
        }
        // Debugger del tablero
//        for (i in tablero) {
//            println(i)
//        }
        var breakcontrol = false
        for (i in tablero.indices){
            for (j in tablero[i].indices){
                if (tablero[i][j]=='*'){
                    if (!breakcontrol && i - 1 in tablero.indices && j - 1 in tablero[i - 1].indices && tablero[i - 1][j - 1] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i - 1 in tablero.indices && j in tablero[i - 1].indices && tablero[i - 1][j] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i - 1 in tablero.indices && j + 1 in tablero[i - 1].indices && tablero[i - 1][j + 1] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i in tablero.indices && j - 1 in tablero[i].indices && tablero[i][j - 1] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i in tablero.indices && j + 1 in tablero[i].indices && tablero[i][j + 1] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i + 1 in tablero.indices && j - 1 in tablero[i + 1].indices && tablero[i + 1][j - 1] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i + 1 in tablero.indices && j in tablero[i + 1].indices && tablero[i + 1][j] == '*') {
                        breakcontrol = true
                    }
                    if (!breakcontrol && i + 1 in tablero.indices && j + 1 in tablero[i + 1].indices && tablero[i + 1][j + 1] == '*') {
                        breakcontrol = true
                    }

                }
            }
        }


        // Debugger del tablero
//        println()
//        for (i in tablero) {
//            println(i)
//        }
        if (breakcontrol==true){
            println("SI")
        }
        else{
            println("NO")
        }




        entrada= readln()
    }
}