fun main() {
    var num_numeros = readln().toInt()
    while (num_numeros!=0) {
        val numeros= readln()
        val lista_numeros=numeros.split(" ")
        var lista_numeros_int= mutableListOf(0)
        lista_numeros_int.removeFirst()
        for (i in lista_numeros) {
            lista_numeros_int.add(i.toInt())
        }
        val lista_numeros_int_ordenada=lista_numeros_int.sorted()
        var posicion= lista_numeros_int_ordenada.size/2
        var posicion_par= lista_numeros_int_ordenada.size%2
        var resultado=0
        if(posicion_par==0){
            resultado+=(lista_numeros_int_ordenada[posicion-1]+lista_numeros_int_ordenada[posicion])
        }
        else {
            resultado+=(lista_numeros_int_ordenada[posicion]*2)
        }
        println(resultado)
        num_numeros= readln().toInt()
    }


}