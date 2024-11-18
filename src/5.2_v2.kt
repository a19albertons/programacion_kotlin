fun mcd(num1:Int, num2: Int): Int {
    var resultado:Int = 0
    if (num1%num2 == 0) {
        resultado= num2
    }
    else {
        resultado = resultado + mcd(num1, num1%num2)
    }
    return resultado
}
//fun main() {
//    println(""+mcd(20,10)+", "+mcd(20,8)+", "+mcd(20,6)+", "+mcd(72,16))
//}