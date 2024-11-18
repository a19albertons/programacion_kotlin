fun main() {
    val num_casos = readln().toInt()
    for (item in 1..num_casos) {
        val numeros = readln()
        val lista_numeros = numeros.split(" ")
        val saldo = lista_numeros[0].toInt()
        val diferencia = lista_numeros[1].toInt()
        val resultado = saldo+diferencia
//        println(resultado)

//        Imprime en función del resultado
        if (resultado>0) {
            println("SI")
        }
        else {
            println("NO")
        }
    }
}