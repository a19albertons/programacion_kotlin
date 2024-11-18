fun main() {
//    Pedimos variables por teclado
    val entrada = readln()
    val lista_num =entrada.split(" ")
    val num1= lista_num[0].toInt()
    val num2= lista_num[1].toInt()

//    Hacemos la comprobación de si es multiple
    if (num1 % num2 == 0) {
        print("$num1 es múltiplo de $num2")
    }
    else {
        print("$num1 no es múltiplo de $num2")
    }

}