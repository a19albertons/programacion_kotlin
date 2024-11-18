fun piNilakantha(numero:Int): Double {
    var resultado:Double
    if (numero >= 0) {
        resultado = 3.0
        var i = 0
        while (numero > i) {

            if (i%2 == 0) {
                val calculo:Double= 4.0 / ((2.0+i.toDouble()*2) * (3.0+i.toDouble()*2) * (4.0+i.toDouble()*2))
                resultado = resultado + calculo


            }
            else {
                val calculo:Double= 4.0 / ((2.0+i.toDouble()*2) * (3.0+i.toDouble()*2) * (4.0+i.toDouble()*2))
                resultado = resultado - calculo
            }

            i++
        }
    }
    else {
        resultado = 3.0
    }
    return (resultado)
}
//fun main() {
//    println(piNilakantha(0))
//    println(piNilakantha(1))
//    println(piNilakantha(4))
//    println(piNilakantha(-2))
//    println(piNilakantha(50))
//}