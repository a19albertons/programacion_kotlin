fun main() {
//    Pedmismo variables al usuario
    print("Inserte su peso en Kg: ")
    val peso = readln().toFloat()
    print("insete su tamaño en m: ")
    val altura = readln().toFloat()

//    Calculamos el IMC
    val imc = peso/(altura*altura)

//    Mostramos el texto de la relación
    if (imc>=30) {
        print("esta obeso")
    } else if (imc >= 25) {
        print("tiene sobrepeso")
    } else if (imc >= 18.5) {
        print ("esta en la media")
    } else {
        print("esta delgado")
    }
}