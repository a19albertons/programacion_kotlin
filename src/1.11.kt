fun main() {
//    Solicitud de variables base
    print("Inserte 3 caracteres: ")
    var caracteres:String = readln()

//    Cambio posicio 2 y 3
    val primera=caracteres[0]
    val segunda=caracteres[1]
    val tercera=caracteres[2]

    var caracteres_modificado:String = "$primera$tercera$segunda"
    print(caracteres_modificado)
}