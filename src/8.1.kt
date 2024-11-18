fun main(){
//    Meses
    val enero = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
    val febrero = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28)
    val marzo = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
    val abril = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    val mayo = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
    val junio = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    val julio = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
    val agosto = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
    val septiembre = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    val octubre = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
    val noviembre = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    val diciembre = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)

//    peticion veces
    val num_veces= readln().toInt()
    for (i in 1..num_veces) {
        val fecha = readln()
        val lista_fecha= fecha.split(" ")
        val dia=lista_fecha[0].toInt()
        val mes=lista_fecha[1].toInt()
        var total_dias=0
        for (j in mes..12) {
            if (mes!=j) {
                when (j){
                    1 -> total_dias+=enero.lastIndex
                    2 -> total_dias+=febrero.lastIndex
                    3 -> total_dias+=marzo.lastIndex
                    4 -> total_dias+=abril.lastIndex
                    5 -> total_dias+=mayo.lastIndex
                    6 -> total_dias+=junio.lastIndex
                    7 -> total_dias+=julio.lastIndex
                    8 -> total_dias+=agosto.lastIndex
                    9 -> total_dias+=septiembre.lastIndex
                    10 -> total_dias+=octubre.lastIndex
                    11 -> total_dias+=noviembre.lastIndex
                    12 -> total_dias+=diciembre.lastIndex
                }
            }
            else {
                when (j){
                    1 -> total_dias+=enero.lastIndex-dia
                    2 -> total_dias+=febrero.lastIndex-dia
                    3 -> total_dias+=marzo.lastIndex-dia
                    4 -> total_dias+=abril.lastIndex-dia
                    5 -> total_dias+=mayo.lastIndex-dia
                    6 -> total_dias+=junio.lastIndex-dia
                    7 -> total_dias+=julio.lastIndex-dia
                    8 -> total_dias+=agosto.lastIndex-dia
                    9 -> total_dias+=septiembre.lastIndex-dia
                    10 -> total_dias+=octubre.lastIndex-dia
                    11 -> total_dias+=noviembre.lastIndex-dia
                    12 -> total_dias+=diciembre.lastIndex-dia
                }
            }
        }
        println(total_dias)

    }
}