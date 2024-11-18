fun myIndexOf(texto:String,caracter:Char):Int {
    var resultado:Int = 0
    var j=0
    for (i in texto) {
        if (i == caracter)  {

            resultado=j
            break
        }
        else {
            resultado = -1
        }
        ++j
    }
    return resultado
}
//fun main () {
//    println(myIndexOf("hola a todos",'s'))
//    println(myIndexOf("hola a todos",' '))
//    println(myIndexOf("hola a todos",'H'))
//    println(myIndexOf("hola a todos",'a'))
//    println(myIndexOf("DAM",'M'))
//    println(myIndexOf("1234",'4'))
//}