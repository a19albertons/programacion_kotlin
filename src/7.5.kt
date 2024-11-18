fun main() {
    var linea= readlnOrNull()
    while (linea!=null) {

//        Controla los casos que sabemos que tienen punto en su estructura o es especial
        if ("." in linea || linea == "999") {
//            Creamos 2 variables que sera una string de la linea sin punto y su longitud sin ellos
//            Adicionalmente una intermedia que realizara el incremento de +1
            var intermediario=linea.replace(".","").toLong()
            intermediario= intermediario + 1
            var numero=intermediario.toString().replace("-","").split("")

            var linea_sin_punto = intermediario.toString().replace(".","").replace("-","").length

//            Creamos un primer bucle for que generara el numero a la inversa con el punto nuevamente
            var j = 0
            var numero_invertido = StringBuilder()
            for (i in linea_sin_punto downTo 0) {
                j++
                if (j==3){
                    numero_invertido.append(numero[i])
                    numero_invertido.append(".")
                    j=0
                }
                else {
                    numero_invertido.append(numero[i])
                }
            }


//            Revierte la inversión y la imprime
            var numero_corregido = StringBuilder()
            for (correcion in numero_invertido.toString().length-1 downTo 0) {
                numero_corregido.append(numero_invertido.toString()[correcion])
            }
            println(numero_corregido.toString())

        }
        //        Controla los casos conocidos sin punto (1 a 998)
        else {
            println(linea.toLong()+1)
        }

        linea= readlnOrNull()
    }
}