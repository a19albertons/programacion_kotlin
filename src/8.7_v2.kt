fun main() {
    var num_numeros= readln().toInt()
    while (num_numeros!=0){
        val lista_numeros= readln().split(" ").toList()
        val lista_numeros_ordenada=lista_numeros.sorted()
        var comparar=0
        var num_veces=0
        var veces_maximo=0
        var moda=0
        for (i in 0 until num_numeros) {
            if (lista_numeros_ordenada[i].toInt()==comparar){
                num_veces+=1
                if (num_veces>veces_maximo){
                    veces_maximo=num_veces
                    moda=lista_numeros_ordenada[i].toInt()
                }
            }
            else {
                comparar=lista_numeros_ordenada[i].toInt()
                num_veces=1
//                Se añade este bloque aqui para cubrir el escenario
//                donde la moda proviene de un listado de un solo numero
                if (num_veces>veces_maximo){
                    veces_maximo=num_veces
                    moda=lista_numeros_ordenada[i].toInt()
                }
            }
        }
//        println(lista_numeros_ordenada)
        println(moda)

        num_numeros= readln().toInt()
    }
}