fun main(){
    var numero_lineas = readln().toInt()
    while (numero_lineas != 0) {
        val lista_base = mutableListOf<List<Int>>()
//        Cramos el cuadrado
        for (i in 1..numero_lineas) {
            val fila = readln()
            val fila_lista=fila.replace("  "," ").split(" ")
            val fila_lista_int= mutableListOf<Int>()
            for (j in fila_lista){
                fila_lista_int.add(j.toString().toInt())
            }
            lista_base.add(fila_lista_int)
        }
//        Comprobamos diagonal
        var diagonal=0
        for (j in 0 until numero_lineas) {
            if (lista_base[j][j]==1) {
                diagonal++
            }
        }
//        Gestion más de un numero distinto a 0 en cualquier fila
        var solo_un_numero=true
        for (i in lista_base) {
            var numero_lista=0
            for (j in i) {
                if (j != 0){
                    numero_lista++
                    if (numero_lista == 2) {
                        solo_un_numero=false
                    }
                }
            }
        }
//        En funcion de las comprobaciones dice si o no
        if (diagonal==numero_lineas && solo_un_numero==true) {
            println("SI")
        }
        else {
            println("NO")
        }


        numero_lineas= readln().toInt()
    }

}