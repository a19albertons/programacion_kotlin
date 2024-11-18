fun main() {
    var numero = readln().toInt()
    while(0!=numero) {
        val triangulo = 3
        var total:Int = 0
        for (valor in 1..numero) {
            total+=(valor*triangulo)
        }
        println(total)

        numero=readln().toInt()
    }
}