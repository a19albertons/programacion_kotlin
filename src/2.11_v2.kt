import kotlin.system.exitProcess

fun main() {
//    Entrada de usuario y procesado
    val entrada = readln()
    val lista_entrada = entrada.split(" ")
    val distancia= lista_entrada[0].toInt()
    val v_max= lista_entrada[1].toInt()
    val tiempo= lista_entrada[2].toInt()

//    convertimos la velocidad maxima a m/s
    val v_max2 = (v_max/3.6).toDouble()

//    Obtenemos la velocidad del coche media en m/s
    val v_media = distancia.toDouble()/tiempo.toDouble()

//    Comprobamos si el coche iba a la velocidad debida
    if (distancia <= 0 || v_max <= 0 || tiempo <= 0) {
        println("ERROR")
        exitProcess(0)
    }
    if (v_media <= v_max2) {
        println("OK")
    }
    if (v_media >= v_max2 * 1.2) {
        println("PUNTOS")
    }
    else if (v_media >= v_max2) {
        println("MULTA")
    }


//    println(v_media)
//    println(v_max2)
}