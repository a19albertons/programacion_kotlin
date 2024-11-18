fun main(){
    val num_casos= readln().toInt()
    for (i in 1..num_casos) {
        val lista1 = readln().split(" ")
        val lista2 = readln().split(" ")
        var lista1_int= mutableListOf(1)
        lista1_int.removeFirst()
        var lista2_int= mutableListOf(1)
        lista2_int.removeFirst()
        for (j in lista1) {
            lista1_int.add(j.toInt())
        }
        for (j in lista2) {
            lista2_int.add(j.toInt())
        }

        val base=lista1_int[0]+lista2_int[0]
        var z=1
        for (j in 1 until lista1_int.size) {
            if (base==(lista1_int[j]+lista2_int[j])) {
                z++
            }
        }
        if (z==6){
            println("SI")
        }
        else {
            println("NO")
        }
    }
}