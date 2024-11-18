fun main() {
//    Variables predefinidas
    var entrada_origen = readln()
    var entrada_split = entrada_origen.split(" ")
    var x=entrada_split[0].toInt()
    var y=entrada_split[1].toInt()
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