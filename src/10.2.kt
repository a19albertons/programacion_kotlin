fun miAdd(array: CharArray,numero:Int,valor:Char): CharArray {
    val resultado=array.copyOf(array.size+1)

    var j = 0
//    Controla los casos de valor 0
    if (array.size==0) {
        resultado[0]=valor
    }
//    Controla los casos de si quieres añadir al medio
    for (i in 0 until array.size) {
//        Variable que controlara el +1 cuando añadamos el caracter
        if (i!=numero) {
            resultado[i+j]=array[i]
        }
        else {
            j=1
            resultado[i]=valor
            resultado[i+j]=array[i]
        }
    }
//    Controla los casos de cuando quieres añadir al final
    if (array.size==numero) {
        resultado[array.size]=valor
    }
    return resultado
}
fun miRemoveAt(array: CharArray, numero: Int): CharArray {
    val resultado= array.copyOf(array.size-1)
    var j = 0
    for (i in 0 until array.size) {
//        Variable que controla el momento en que borramos un caracter

        if (i!=numero) {
            resultado[i-j]=array[i]
        }
        else {
            j=1
        }
    }
    return resultado

}
//fun main(){
//    var a1 = charArrayOf('a', 'b', 'c', 'd')
//    a1 = miAdd(a1, 3, 'X')
//    println(a1.joinToString())
//    a1 = miRemoveAt(a1, 2)
//    println(a1.joinToString())
//    var a2 = charArrayOf()
//    a2 = miAdd(a2, 0, 'A')
//    println(a2.joinToString())
//    a2 = miRemoveAt(a2, 0)
//    println(a2.joinToString())
//    a2 = miAdd(a2, 0, 'X')
//    println(a2.joinToString())
//    a2 = miAdd(a2, 1, 'Z')
//    println(a2.joinToString())
//
//}


