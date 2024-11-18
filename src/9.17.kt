//Funcion de la mutliplicacion rusa
fun mulRusa2(num1: Int, num2: Int): Int {

//    Generación de las distintas variables
    var num1_modificable = num1
    var num2_modificable = num2
    var lista_num1:MutableList<Int> = mutableListOf()
    var lista_num2:MutableList<Int> = mutableListOf()

//    bucle sobre lista mutable que añade los valores de multiplicacion rusa
    lista_num1.add(num1_modificable)
    lista_num2.add(num2_modificable)
    while (num2_modificable != 1) {
        num1_modificable *= 2
        num2_modificable /= 2
        lista_num1.add(num1_modificable)
        lista_num2.add(num2_modificable)

    }
//    println(lista_num1)
//    println(lista_num2)

//    Calculo de resultado de la multiplicación rusa
    var resultado:Int = 0
    for (item in 0..lista_num1.lastIndex) {
        if (lista_num2[item]%2 == 1 || lista_num2[item] == 1) {
            resultado = resultado + lista_num1[item]
        }
    }
    return (resultado)
}
//fun main() {
//    println(mulRusa(105,1))
//    println(mulRusa(1,105))
//    println(mulRusa(1999,33))
//    println(mulRusa(210,10000))
//    println(mulRusa(105,68))
//}