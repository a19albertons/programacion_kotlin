fun main() {
//    Pides el valor numerico de mes
    val num_mes = readln().toInt()

//    Switch del numero de mes
    when (num_mes) {
        1 -> println("el mes $num_mes se llama Enero")
        2 -> println("el mes $num_mes se llama Febrero")
        3 -> println("el mes $num_mes se llama Marzo")
        4 -> println("el mes $num_mes se llama Abril")
        5 -> println("el mes $num_mes se llama Mayo")
        6 -> println("el mes $num_mes se llama Junio")
        7 -> println("el mes $num_mes se llama Julio")
        8 -> println("el mes $num_mes se llama Agosto")
        9 -> println("el mes $num_mes se llama Septiembre")
        10 -> println("el mes $num_mes se llama Octubre")
        11 -> println("el mes $num_mes se llama Noviembre")
        12 -> println("el mes $num_mes se llama Diciembre")
    }
}