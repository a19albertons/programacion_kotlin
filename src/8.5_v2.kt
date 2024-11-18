
fun main(){
    val num_casos= readln().toInt()
    for (i in 1..num_casos) {
        val lista1= readln().split(" ").toList()
        val lista2= readln().split(" ").toList()
        val dientes_base= lista1[0].toString().toInt()+lista2[0].toString().toInt()
        var dientes_correctos=1
        for (j in 1 until 6) {
            if (dientes_base==(lista1[j].toString().toInt()+lista2[j].toString().toInt())) {
                dientes_correctos+=1
            }
            else {
                break
            }
        }
        if (dientes_correctos==6) {
            println("SI")
        }
        else {
            println("NO")
        }
    }
}