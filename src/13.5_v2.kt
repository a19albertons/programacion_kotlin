fun main(){
    var entrada= readlnOrNull()
    while (entrada!=null) {
        val entrada_int=entrada.toInt()
        val tablero= mutableListOf<MutableList<Int>>()
//        Creamos el dibujo base
        for (i in 1..entrada_int) {
            val lista_temporal= mutableListOf<Int>()
            for (j in 1..entrada_int) {
                lista_temporal.add(0)
            }
            tablero.add(lista_temporal)
        }
//Modifica el dibujo base
//        Calcular radio
        val radio=entrada_int/2
        for (i in 0 until entrada_int) {
            for (j in 0 until entrada_int) {
                val distancia = (i-radio)*(i-radio)+(j-radio)*(j-radio)
                if (radio*radio>=distancia) {
                    tablero[i][j]=1
                }
            }
        }




//        Dibuja el circulo
        for (i in tablero) {
            for (j in i) {
                print(j.toString()+"  ")
            }
            println()
        }







        entrada= readlnOrNull()
    }
}