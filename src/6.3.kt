fun main() {
//    Entrada en bucle si corresponde
    var entrada = readln()
    var lista_numeros = entrada.split(" ")
    var huevos = lista_numeros[0].toInt()
    var capacidad = lista_numeros[1].toInt()
    while (huevos !=0 && capacidad != 0) {
        var tiempo=0
        do {
            huevos-=capacidad
            tiempo+=10
        } while (huevos>0)

        println(tiempo)



//        Reentrada en bucle si corresponde
        entrada = readln()
        lista_numeros = entrada.split(" ")
        huevos = lista_numeros[0].toInt()
        capacidad = lista_numeros[1].toInt()
    }
}