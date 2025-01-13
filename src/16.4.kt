// Se elimina el criterio de expansion atendiendo al ultimo parrafo
fun infecion(tablero: MutableList<StringBuilder>, x: Int, y: Int): Boolean {
//    Limites tablero
    if (x !in tablero.indices || y !in tablero[x].indices) return false
//    Barrera inmunes
    if (tablero[x][y]=='I') return false
//    Bloquear bucle infinito/no volver sobre los mismos pasos
    if (tablero[x][y]=='X') return false
//    Protegerte de matar al transmisor padre
    if (tablero[x][y] != 'T'){
        tablero[x][y]='X'
    }

//    Criterios de expansion
    if (infecion(tablero,x-1,y-1)) return true
    if (infecion(tablero,x-1,y)) return true
    if (infecion(tablero,x-1,y+1)) return true
    if (infecion(tablero,x,y-1)) return true
    if (infecion(tablero,x,y+1)) return true
    if (infecion(tablero,x+1,y-1)) return true
    if (infecion(tablero,x+1,y)) return true
    if (infecion(tablero,x+1,y+1)) return true


//    Que finalice
    return false
}





fun main(){
    var entrada= readln()
    while (entrada!="0"){
        val tablero= mutableListOf<StringBuilder>()
        val entrada_int = entrada.toInt()
//        Creacion tablero
        for (i in 1..entrada_int){
            tablero.add(StringBuilder(readln()))
        }


//        Procesado tablero
//        Asumimos viendo los ejemplos un unico infectado por caso
//        en ningun momento se dice en el enunciado
        var x=0
        var y=0
        var salir=false
        for (i in tablero.indices) {
            for (j in tablero[i].indices){
                if (tablero[i][j]=='T') {
                    x=i
                    y=j
                    salir=true
                    break
                }
            }
            if (salir){
                break
            }
        }
        infecion(tablero,x,y)





//        Impresion tablero
        for (i in 0..entrada_int-1){
            println(tablero[i])
        }


        println("---------------")

        entrada= readln()
    }
}