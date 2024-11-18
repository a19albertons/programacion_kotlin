fun main() {
    val num_casos = readln().toInt()
    for (item in 1..num_casos) {
        val frase = readln()
        val division_frase = frase.split(" ")
        val nombre = division_frase[1]
        if (nombre.length<101) {
            println("Hola, $nombre.")
        }
    }
}