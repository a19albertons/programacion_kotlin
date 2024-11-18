fun main(){
    val num_casos= readln().toInt()
    for (i in 1..num_casos) {
        val dientes_superior= readln().split(" ")
        val dientes_inferior= readln().split(" ")
//        Se crea el array
        val array_superior=Array<Int>(size = 6) {0}
        val array_inferior=Array<Int>(size = 6) {0}
        for (j in 0 until array_superior.size) {
            array_superior.set(j,dientes_superior[j].toInt())
            array_inferior.set(j,dientes_inferior[j].toInt())
        }
        val dientes_base = array_superior[0]+array_inferior[0]
        var resultado="SI"
        for (j in 1 until array_superior.size) {
            if (dientes_base!=(array_superior[j]+array_inferior[j])) {
                resultado="NO"
                break
            }

        }
        println(resultado)






    }
}