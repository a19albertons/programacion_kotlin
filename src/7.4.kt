fun main(){
    val num_casos= readln().toInt()

    for (i in 1..num_casos) {
        var num_muros= readln().toInt()
        var varios_numeros= readln()
        val lista_numeros=varios_numeros.split(" ")
        var sube = 0
        var baja = 0
        for (j in 0..num_muros-2) {
            val valor1= lista_numeros[j]
            val valor2 = lista_numeros[j+1]
            if (valor1 == valor2) {
                print("")
            }
            else if (valor1 > valor2) {
                baja+=1
            }
            else {
                sube += 1
            }
        }
        println("$sube $baja")
    }
}