fun main () {
    val num_casos= readln().toInt()
    for (item in 1..num_casos) {
        val numeros= readln()
        val lista_numeros = numeros.split(" ")
        println(lista_numeros[0].toInt()*6+lista_numeros[1].toInt()*8+lista_numeros[2].toInt()*10+(lista_numeros[3].toInt()*lista_numeros[4].toInt()*2))
    }
}