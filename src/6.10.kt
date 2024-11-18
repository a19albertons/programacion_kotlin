fun main() {
    val num_veces= readln().toInt()
    for (item in 1..num_veces) {
        val frase = readln()
        val lista_palabra = frase.split(" es ")
        val palabra1= lista_palabra[0].lowercase()
        val palabra2= lista_palabra[1].lowercase()
        if (20>=palabra1.length && 20>= palabra2.length && palabra1==palabra2) {
            println("TAUTOLOGIA")
        }
        else {
            println("NO TAUTOLOGIA")
        }
    }
}