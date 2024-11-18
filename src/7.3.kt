fun main() {
    var numeros = readln()
    while (numeros != "0 0"){
        val lista= numeros.split(" ")
        val numero1=lista[0].toInt()
        val numero2=lista[1].toInt()
        val numero1_incrementado=numero1+99

        val opcion1:Int
        if (numero1<numero2) {
            opcion1=numero1_incrementado-numero2
        }
        else {
            opcion1=numero1-numero2
        }
        val opcion2:Int
        if (numero1>numero2) {
            opcion2=numero2-numero1+99
        }
        else{
            opcion2=numero2-numero1
        }

        if (opcion2>opcion1) {
            println(opcion1)
        }
        else {
            println(opcion2)
        }

        numeros = readln()
    }
}