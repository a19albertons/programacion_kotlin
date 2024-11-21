fun main() {
//    Se introduce una hora en formato hh:mm:ss y se procesa
    val hora_original = readln()
    val lista_hora = hora_original.split(":")
    val hora = lista_hora[0].toInt()
    val minuto = lista_hora[1].toInt()
    val segundo = lista_hora[2].toInt()

//    Procesamos la hora
    var segundo2 = segundo + 1
    var minuto2 = minuto
    var hora2 = hora
    if (segundo2 == 60){
        segundo2=0
        minuto2+=1
    }
    if (minuto2 == 60){
        minuto2=0
        hora2+=1
    }
    if (hora2 == 24){
        hora2=0
    }

//    Imprime el resultado
    when (hora2) {
        0 -> print("00")
        1 -> print("01")
        2 -> print("02")
        3 -> print("03")
        4 -> print("04")
        5 -> print("05")
        6 -> print("06")
        7 -> print("07")
        8 -> print("08")
        9 -> print("09")
        else -> print(hora2)
    }
    print(":")
    when (minuto2) {
        0 -> print("00")
        1 -> print("01")
        2 -> print("02")
        3 -> print("03")
        4 -> print("04")
        5 -> print("05")
        6 -> print("06")
        7 -> print("07")
        8 -> print("08")
        9 -> print("09")
        else -> print(minuto2)
    }
    print(":")
    when (segundo2) {
        0 -> print("00")
        1 -> print("01")
        2 -> print("02")
        3 -> print("03")
        4 -> print("04")
        5 -> print("05")
        6 -> print("06")
        7 -> print("07")
        8 -> print("08")
        9 -> print("09")
        else -> print(segundo2)
    }
}