fun main() {
//    Variables predefinidas
    print("Introduzca el valor de X: ")
    var x= readln().toInt()
    print("Introduzca el valor de Y: ")
    var y= readln().toInt()
    var z:Int

//    Antes de empezar
    println("ANTES: x vale "+ x +" y vale "+y)

//    Intercambio variables
    z=x
    x=y
    y=z

//    Tras ejecutar el codigo
    println("DESPUES: x vale $x y vale $y")
}