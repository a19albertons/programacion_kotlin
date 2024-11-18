fun main() {
    val num_veces = readln().toInt()
    for (item in 1..num_veces) {
        val numeros = readln()
        val lista_numeros = numeros.split(" ")
        val dia= lista_numeros[0].toInt()
        val mes= lista_numeros[1].toInt()
        if (dia == 25 && mes == 12) {
            println("SI")
        }
        else {
            println("NO")
        }
    }
}