import kotlin.system.exitProcess

fun mulRusa4(num1: Int, num2: Int): Int {
    if (num2==0) {
        return 0
    }
    return if (num2%2 != 0) {
        num1 + mulRusa(num1*2,num2/2)
    }
    else {
        mulRusa(num1*2, num2/2)
    }

}
//fun main() {
//    println(mulRusa(105,1))
//    println(mulRusa(1,105))
//    println(mulRusa(1999,33))
//    println(mulRusa(210,10000))
//    println(mulRusa(105,68))
//}