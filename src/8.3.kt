fun main(){
    var entrada= readlnOrNull()
    while (entrada!=null) {
        var resultado= mutableListOf("")
        resultado.removeFirst()
        var posicion=0
        for (i in entrada) {

            if (i.toString()=="-") {
                posicion=0
                continue
            }
            if (i.toString()=="+") {
                posicion=resultado.lastIndex
                continue
            }
            if (i.toString()=="*" && (posicion+1)<=resultado.size){
                posicion+=1
                continue
            }
            else if (i.toString()=="*"){
                continue
            }
            if (i.toString()=="3") {
                resultado.removeAt(posicion)
                continue
            }



            resultado.add(posicion,i.toString())
            posicion+=1

        }



        for (i in 0 until resultado.size) {
            print(resultado[i])
        }
        println("")

        entrada= readlnOrNull()
    }
}