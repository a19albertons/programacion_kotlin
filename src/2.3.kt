fun main() {
//    Se pide por teclado y convierte en lista
    val entrada = readln()
    val lista_num = entrada.split(" ")

//    Extraemos numero de la lista
    val num1=lista_num[0].toInt()
    val num2=lista_num[1].toInt()
    val num3=lista_num[2].toInt()

//    Procesmos las condiciones
    if (num1 == num2 && num1 == num3) {
        print("3 iguales")
    }
    else {
        when {
            num1 > num2 && num1 > num3 -> print(num1)
            num1 < num2 && num2 > num3 -> print(num2)
            num1 < num2 && num2 < num3 -> print(num3)
        }
    }
}