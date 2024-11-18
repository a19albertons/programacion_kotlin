fun main() {
    var entrada = readlnOrNull()

    while (entrada != null) {
        val lista_entrada = entrada.split(" ")
        val num1=lista_entrada[0].toInt()
        val num2=lista_entrada[1].toInt()
        if (num1>0 && num2>0 && num1<10000000 && num2<10000000) {
            println(2*num1+2*num2)
        }

       entrada= readlnOrNull()

    }

}