import kotlin.math.sqrt

fun main() {
    val entrada= readln()
    val num_lineas=entrada.split(" ")[0].toInt()
    val radio=entrada.split(" ")[1].toDouble()
    val mapa= mutableListOf<MutableList<String>>()
//    Hacemos el mapa
    for (i in 1..num_lineas) {
        val linea_temporal= mutableListOf<String>()
        val linea_entrada= readln().split(" ")
        for (j in 0 until num_lineas){
            linea_temporal.add(linea_entrada[j])
        }
        mapa.add(linea_temporal)
    }

//    Procesamos el mapa
    val centro=num_lineas/2
    val centro_dec=centro.toDouble()
    for (i in 0 .. mapa.lastIndex) {
        for (j in 0 .. mapa[i].lastIndex) {
            if (mapa[i][j].contains("C")) {
                val d= sqrt((i-centro_dec)*(i-centro_dec)+(j-centro_dec)*(j-centro_dec))
                if (d<radio) {
                    println(mapa[i][j]+" a "+d)
                }
            }
        }
    }



//    for (i in mapa) {
//        for (j in i) {
//            print(j+" ")
//        }
//        println()
//    }
}