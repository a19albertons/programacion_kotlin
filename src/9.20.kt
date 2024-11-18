fun cesar(texto:String, desplazamiento:Int): String {
    val texto_mayuscula = texto.uppercase()
    for (item in texto_mayuscula) {
        if (item in 'A'..'Z') {
            var nuevo_caracter = item + desplazamiento
            if (nuevo_caracter>'Z') {
                print(nuevo_caracter-26)
            }
            else if ('A'>nuevo_caracter){
                print(nuevo_caracter+26)
            }
            else {
                print(nuevo_caracter)
            }

        }
        else {
            print(item)
        }



    }
    val resultado = ""
    return resultado
}

//fun main() {
//    println(cesar("Alea iacta est", 3))
//    println(cesar("Ave, Caesar, morituri te salutant", 7))
//    println(cesar("VW VCODKGP, DTWVQ?", -2))
//    println(cesar("a",-1))
//    println(cesar("a",-26))
//}