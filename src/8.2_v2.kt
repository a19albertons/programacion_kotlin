fun main() {
    val num_casos= readln().toInt()
    for (i in 1..num_casos) {
        val fecha= readln()
        val dia=fecha.split(" ")[0].toInt()
        val mes=fecha.split(" ")[1].toInt()
//      La posicion 0 como no es un mes numerico le asignamos un 0
        val lista_meses=listOf(0,31,28,31,30,31,30,31,31,30,31,30,30)
        var resultado=0
        for (j in mes..12) {
            if (mes==j){
                resultado = lista_meses[j] - dia
            }
            else {
                resultado += lista_meses[j]
            }
        }
//      Sumamos un dia adicional para tener
//      en cuenta el propio dia en que estamos
        println(resultado+1)
    }
}