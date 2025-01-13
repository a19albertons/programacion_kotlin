fun main(){
    var entrada= readln()
    while (entrada!="0 0"){
        val lista=entrada.split(" ")
//        println(lista)
        val valor1=lista[0].toInt()
        val valor2=lista[1].toInt()
        if (valor1>valor2){
            val variacion=valor1/valor2
            println("E "+variacion+":1")
        }
        else if (valor2>valor1){
            val variacion=valor2/valor1
            println("E 1:"+variacion)
        }
        else {
            println("E 1:1")
        }


        entrada= readln()
    }
}