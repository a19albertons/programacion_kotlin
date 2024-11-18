fun main() {
    var numero = readln()
    var pisos = numero.split(" ")
    while (!("-" in pisos[0])) {
        var diferenciapisos:Int = 0
        for (i in 0..pisos.lastIndex-2) {
            val valor1=pisos[i].toInt()
            val valor2=pisos[i+1].toInt()
            if (valor1 == valor2) {
                diferenciapisos = diferenciapisos
            }
            else if (valor1 < valor2) {
                diferenciapisos = diferenciapisos+(valor2-valor1)
            }
            else {
                diferenciapisos = diferenciapisos + (valor1-valor2)
            }
        }
        println(diferenciapisos)
        numero= readln()
        pisos = numero.split(" ")
    }
}