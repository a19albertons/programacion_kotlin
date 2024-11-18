fun fibonacci(veces:Int): Int {
    if (veces ==0) {
        return 0
    }
    if (veces==1){
        return 1
    }
    return fibonacci(veces-1) + fibonacci(veces-2)
}
//fun main(){
//    println(fibonacci(1))
//    println(fibonacci(2))
//    println(fibonacci(13))
//    println(fibonacci(20))
//}