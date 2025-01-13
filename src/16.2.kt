fun main(){
    var entrada= readlnOrNull()
    while (entrada!=null){
        val lista=entrada.toList()
        val listaint= mutableListOf<Int>()

//        Se pasa la string de numeros a una lista de int mutable
        for (i in lista) {
            listaint.add(i.toString().toInt())
        }
//        println(listaint)
        while (listaint.size>0) {
//            Si el caracter usa 3 digigitos o 2 digitos
            if (listaint[0]==1 && ((listaint[1]<=2 && listaint.size >= 3 && listaint[2]<=7) || (listaint[1]<=1 && listaint.size >= 3 && listaint[2]<=9))){
                val temporal=listaint[0].toString()+listaint[1].toString()+listaint[2].toString()
//                Hace limpia de los numeros ya usados
                listaint.removeFirst()
                listaint.removeFirst()
                listaint.removeFirst()
//                Hace la conversion del string con los caracteres a un int y despues a un char
//                descubierto por accidente durante el examen bajo el criterio
//                haber si hay alguna funcion desde string o int de conversión
//                a char que me ahorre el when de unos 50 casos
                print(temporal.toInt().toChar())

            }
            else {
                val temporal=listaint[0].toString()+listaint[1].toString()
                listaint.removeFirst()
                listaint.removeFirst()
                print(temporal.toInt().toChar())
            }
        }
        println()



        entrada= readlnOrNull()
    }
}