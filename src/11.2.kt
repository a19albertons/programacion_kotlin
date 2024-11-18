fun main () {
    var num_linea= readln().toInt()
    while (num_linea!=0){
        val palabras=mutableMapOf<String, List<Int>>()
        for (i in 1..num_linea){
            val linea= readln().lowercase().split(" ")
            for (j in linea) {
                if (j.length>=3) {
                    if (j !in palabras) {
                        palabras.put(j, mutableListOf(i))
                    }
                    else{
                        val referencias=palabras[j]
                        val nueva_referencia = referencias!!.toMutableList()
                        if (i !in nueva_referencia) {
                            nueva_referencia.add(i)
                            palabras[j] = nueva_referencia
                        }

                    }
                }
            }
        }
        val claves=palabras.keys.sorted()
        for (i in claves) {
            print(i.toString()+" ")
            val valores=palabras[i]!!.toMutableList()
            for (j in valores) {
                print(j.toString()+" ")
            }
            println()
        }


        println("----")
        num_linea= readln().toInt()
    }

}