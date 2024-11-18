fun main() {
    var num_numeros= readln().toInt()
    while (num_numeros!=0) {
        val lista_numeros= readln().split(" ").toList()
        val lista_ordenada= mutableListOf<Int>()
        for (i in lista_numeros) {
            lista_ordenada.add(i.toInt())
        }
        lista_ordenada.sort()
        var mediana=0
        if (lista_ordenada.size %2 == 0) { // es par
            mediana=mediana+lista_ordenada[lista_ordenada.size/2]
            mediana=mediana+lista_ordenada[(lista_ordenada.size/2)-1]
        }
        else {
            mediana=mediana+(lista_ordenada[lista_ordenada.size/2]*2)
        }

        println(mediana)
        num_numeros= readln().toInt()
    }
}