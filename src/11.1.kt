fun main() {
    var num_numeros= readln().toInt()
    while (num_numeros!=0) {
        val lista_numeros= readln().split(" ")
        val diccionario=mutableMapOf<String, Int>()
        for (i in lista_numeros){
            if (i in diccionario) {
                diccionario[i] =  diccionario.get(i) !!+ 1
            }
            else {
                diccionario[i] = 1
            }
        }
        val max_value=diccionario.values.max()
        val moda = diccionario.filterValues { it ==max_value }.keys.max()
        println(moda)



        num_numeros= readln().toInt()
    }
}