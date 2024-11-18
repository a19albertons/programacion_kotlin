fun main() {
    var total:Int = 0
//    Bucle que pide la frase y la procesa
    while (true) {
        val entrada = readLine()
        if (entrada == null) {
            print(total)
            break
        }
        val lista_entrada = entrada.toString().split(" ")
        total = total + lista_entrada.size

    }
}