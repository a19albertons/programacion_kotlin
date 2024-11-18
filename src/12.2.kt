fun main(){
    var numero_lineas= readln().toInt()
    while (numero_lineas!=0) {
        val lista_base= mutableListOf<MutableList<Int>>()
        for (i in 1..numero_lineas) {
            val fila = readln()
            val fila_lista=fila.replace("  "," ").split(" ")
            val fila_lista_int= mutableListOf<Int>()
            for (j in fila_lista){
                fila_lista_int.add(j.toString().toInt())
            }
            lista_base.add(fila_lista_int)
        }
        val lista_0 = mutableListOf<Int>()
//        Controla el numero de 0
        for (i in 0 until numero_lineas) {
            var veces_0 = 0
            for (j in lista_base[i]){
                if (j == 0) {
                    veces_0++
                }
            }
            lista_0.add(veces_0)
        }
//        println(lista_0)
        var ascendiente=0
        var descendiente=lista_0.size-1
        for (i in 0 until lista_0.size) {
            if (i == lista_0[i]) {
                ascendiente++
            }
        }
        var posicion=0
        for (i in lista_0.size - 1 downTo 0) {
            if (i == lista_0[posicion]) {
                descendiente--
                posicion++
            }
        }
//        Hay que tener en cuenta que por la logica aplicado en pasos previos
//        el ascendiente siempre sera el tamaño del size y descendiente tiene que ser -1
//        porque hace una iterración adicional sobre lo esperado
        if (ascendiente==lista_0.size || descendiente==-1){
            println("SI")
        }
        else {
            println("NO")
        }




        numero_lineas= readln().toInt()
    }
}