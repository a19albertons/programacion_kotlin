fun main() {
//    Variables base lo que pide y el total
    val letra = readln()
    var frases = readln()
    var total = 0

//    Inicializamos el bucle
    while (true) {
//        comprobamos si la frase contiene los 2 caracteres
        if ("<>" in frases) {

//            Dividismos la frase en 2 partes antes y despues de los signos
            val frase_dividida = frases.split("<>")
            for (item in frase_dividida[0]) {
                if (letra.first() == item) {
                    total = total + 1
                }
            }
//            Imprime el total de apariciones de la letra y sale del bucle
            println(total)
            break
        }
//        Procesa todas las lineas sin los signos
        for (item in frases) {
            if (letra.first() == item) {
                total = total + 1
            }
        }
        frases = readln()
    }
}