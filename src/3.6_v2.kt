fun main() {
//    Pedimos datos y los procesamos
    val num_veces = readln().toInt()

    for (item in 0..(num_veces-1)) {
        val entrada_datos = readln()
        val lista_datos = entrada_datos.split(" ")
        val perimetro = lista_datos[0]
        val diametro = lista_datos[1]
        val resultado = perimetro.toFloat()/diametro.toFloat()
        if (resultado>3.1415 && resultado < 3.1417 ) {
            println("ES CIRCUNFERENCIA")
        }
        else {
            println("PARECE UN HUEVO")
        }
    }
}