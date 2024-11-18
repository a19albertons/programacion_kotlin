fun imprimirTabla(valor1:Int, valor2:Int) {
    println("Tabla de multiplicar del $valor1 hasta el $valor2")
    println("======================================")
    for (i in 1..valor2) {
        println("$valor1*$i=${valor1*i}")
    }
    println()
}
//
//fun main(){
//    imprimirTabla(3,4)
//    imprimirTabla(6,5)
//}