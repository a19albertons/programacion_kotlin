fun cesar2(texto:String, desplazamiento:Int): String {
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
//    val texto1 = "Alea iacta est"
//    val numero1 = 3
//    cesar(texto1,numero1)
//    val texto2 = "Ave, Caesar, morituri te salutant"
//    val numero2 = 7
//    cesar(texto2,numero2)
//    val texto3 = "VW VCODKGP, DTWVQ?"
//    val numero3 = -2
//    cesar(texto3,numero3)
//    val texto4 = "a"
//    val numero4 = -1
//    cesar(texto4,numero4)
//    val texto5 = "a"
//    val numero5 = -26
//    cesar(texto5,numero5)
//}