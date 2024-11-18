fun mcd2(num1:Int, num2: Int) {
    if (num1%num2 == 0) {
        print(num2)
    }
    else {
        mcd(num1, num1%num2)
    }
}
//fun main() {
//    mcd(20,10)
//    mcd (20,8)
//    mcd (20,6)
//    mcd (72,16)
//}