fun main() {
//    Se pide el nombre del mes
    val nombre_mes = readln()

//    switch del nombre del mes
    when (nombre_mes) {
        "Enero" -> println("el mes $nombre_mes es el numero 1")
        "Febrero" -> println("el mes $nombre_mes es el numero 2")
        "Marzo" -> println("el mes $nombre_mes es el numero 3")
        "Abril" -> println("el mes $nombre_mes es el numero 4")
        "Mayo" -> println("el mes $nombre_mes es el numero 5")
        "Junio" -> println("el mes $nombre_mes es el numero 6")
        "Julio" -> println("el mes $nombre_mes es el numero 7")
        "Agosto" -> println("el mes $nombre_mes es el numero 8")
        "Septiembre" -> println("el mes $nombre_mes es el numero 9")
        "Octubre" -> println("el mes $nombre_mes es el numero 10")
        "Noviembre" -> println("el mes $nombre_mes es el numero 11")
        "Diciembre" -> println("el mes $nombre_mes es el numero 12")
    }
}