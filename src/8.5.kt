fun main() {
    var num_numeros= readln().toInt()
    while (num_numeros!=0) {
        val lista_numeros = readln().split(" ")
        val lista_numeros_int = mutableListOf(1)
        lista_numeros_int.removeFirst()
        for (i in lista_numeros){
            lista_numeros_int.add(i.toInt())
        }

        var num_picos=0
        if (lista_numeros_int[0]>lista_numeros_int[lista_numeros_int.lastIndex] && lista_numeros_int[0]>lista_numeros_int[0+1]) {
            num_picos+=1
        }
        for (i in 1 until lista_numeros_int.size-1) {
            if (lista_numeros_int[i]>lista_numeros_int[i-1]&&lista_numeros_int[i]>lista_numeros_int[i+1]) {
                num_picos+=1
            }
        }
        if (lista_numeros_int[lista_numeros_int.lastIndex]>lista_numeros_int[lista_numeros_int.lastIndex-1] && lista_numeros_int[lista_numeros_int.lastIndex]>lista_numeros_int[0]) {
            num_picos+=1
        }
        println(num_picos)
        num_numeros= readln().toInt()
    }
}