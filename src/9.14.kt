fun media(valor1:Int, valor2:Int): Double {
    return ((valor1.toDouble()+valor2.toDouble())/2.0)
}
fun media(valor1:Double, valor2:Double): Double {
    return ((valor1+valor2)/2.0)
}
fun media(valor1:String, valor2:String): Double {
    return ((valor1.toDouble()+valor2.toDouble())/2.0)
}
//fun main() {
//    println(media(2, 3))
//    println(media(2.0, 3.0))
//    println(media("2", "3"))
//}