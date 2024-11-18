fun main() {
//    Pedimos al usaurio el lado del cuadrado
    print("Indiquemos el tamaño del lado del cuadrado: ")
    val lado_cuadrado = readln().toInt()

//    Calculamos el area del cuadrado
    val area_cuadrado = lado_cuadrado*lado_cuadrado

//    Devolvemos mensaje al usuario
    print("Para un cuadrado de lado "+lado_cuadrado+" su area es "+area_cuadrado)
}