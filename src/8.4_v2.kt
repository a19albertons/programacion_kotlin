fun main(){
    var entrada= readlnOrNull()
    while (entrada!=null){
        val resultado= mutableListOf<String>()
        var posicion=0
        for (i in 0 ..entrada.lastIndex) {
            if (entrada[i].toString()=="-"){
                posicion=0
                continue
            }
            if (entrada[i].toString()=="+") {
                posicion=resultado.size
                continue
            }
            if (entrada[i].toString()=="3"){
                resultado.removeAt(posicion)
                continue
            }
            if (entrada[i].toString()=="*"){
                if (posicion<resultado.size) {
                    posicion+=1
                }
                continue
            }



            resultado.add(posicion,entrada[i].toString())
            posicion+=1
        }

        for (i in 0..resultado.lastIndex){
            print(resultado[i])
        }
        println()
        entrada= readlnOrNull()
    }
}