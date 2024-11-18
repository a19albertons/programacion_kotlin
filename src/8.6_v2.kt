fun main() {
    var num_alturas= readln().toInt()
    while (num_alturas!=0){
        val lista_valores= readln().split(" ").toList()
        var picos=0
//      Primer caso
        if (lista_valores[0].toInt()>lista_valores[1].toInt() && lista_valores[0].toInt()>lista_valores[lista_valores.lastIndex].toInt()) {
            picos+=1
        }
//      Los del medio
        for (i in 1..lista_valores.lastIndex-1) {
            if (lista_valores[i].toInt()>lista_valores[i+1].toInt() && lista_valores[i].toInt()>lista_valores[i-1].toInt()) {
                picos+=1
            }
        }
//      Ultimo caso
        if (lista_valores[lista_valores.lastIndex].toInt()>lista_valores[0].toInt() && lista_valores[lista_valores.lastIndex].toInt()>lista_valores[lista_valores.lastIndex-1].toInt()) {
            picos+=1
        }
        println(picos)
        num_alturas= readln().toInt()
    }
}