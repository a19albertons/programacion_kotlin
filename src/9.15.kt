fun esCorrecta(ruta:String): Boolean{
    var resultado = true
    for (i in ruta) {
        when (i.toString()) {
            "S" -> print("")
            "N" -> print("")
            "E" -> print("")
            "O" -> print("")
            " " -> print("")
            else -> resultado=false
        }
    }
    return resultado
}
//fun main(){
//    val listaRutas = listOf("S    O S O", "S O N", "S A N S O N", "E S   H O", "E N I S O")
//    for (ruta in listaRutas) {
//        println(if(esCorrecta(ruta)) "CORRECTA" else "INCORRECTA")
//    }
//}