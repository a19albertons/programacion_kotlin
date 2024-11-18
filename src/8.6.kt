fun main() {
    var num_numeros = readln().toInt()
    while (num_numeros!=0) {
        val lista_numeros= readln().split(" ")
        val lista_numeros_int= mutableListOf(1)
        lista_numeros_int.removeFirst()
        for (i in lista_numeros) {
            lista_numeros_int.add(i.toInt())
        }
        var cero=0
        var uno=0
        var dos=0
        var tres=0
        var cuatro=0
        var cinco=0
        var seis=0
        var siete=0
        var ocho=0
        var nueve=0
        for (i in lista_numeros_int) {
            when (i) {
                0 -> cero+=1
                1 -> uno+=1
                2 -> dos+=1
                3 -> tres+=1
                4 -> cuatro+=1
                5 -> cinco+=1
                6 -> seis+=1
                7 -> siete+=1
                8 -> ocho+=1
                9 -> nueve+=1
            }
        }
        val moda= maxOf(cero,uno,dos,tres, cuatro, cinco, seis, siete, ocho,nueve)
        when (moda) {
            cero -> println(0)
            uno -> println(1)
            dos -> println(2)
            tres -> println(3)
            cuatro -> println(4)
            cinco -> println(5)
            seis -> println(6)
            siete -> println(7)
            ocho -> println(8)
            nueve -> println(9)
        }


        num_numeros= readln().toInt()
    }
}