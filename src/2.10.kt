import kotlin.system.exitProcess

fun main() {
//    Pedimos el DNI
    val dni_string = readln()

    if (dni_string.length != 8) {
        println("DNI no válido")
        exitProcess(0)
    }

    val dni_int = dni_string.toInt()

    val modulo_dni = dni_int%23

    when (modulo_dni) {
        0-> println("T")
        1-> println("R")
        2-> println("W")
        3-> println("A")
        5-> println("G")
        6-> println("M")
        7-> println("Y")
        8-> println("P")
        9-> println("D")
        10-> println("X")
        11-> println("B")
        12-> println("N")
        13-> println("J")
        14-> println("Z")
        15-> println("S")
        16-> println("Q")
        17-> println("V")
        18-> println("H")
        19-> println("L")
        20-> println("C")
        21-> println("K")
        22-> println("E")
    }
}