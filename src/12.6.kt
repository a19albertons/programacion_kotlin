fun main(){
    var entrada= readln()
    while (entrada!="0 0") {
        val lineas=entrada.split(" ")[0].toInt()
        val colores=entrada.split(" ")[1].toInt()
        val cuadro= mutableListOf<MutableList<Char>>()
        for (i in 1..lineas) {
            val linea_cuadro= readln().toMutableList()
            cuadro.add(linea_cuadro)
        }
        val num_daltonicos= readln().toInt()
//        Bucle de logica de conversion de los daltonicos
        for (i in 1..num_daltonicos) {
            val cambio_letra= readln()
            val color_original=cambio_letra.split(" ")[0]
            val color_nuevo=cambio_letra.split(" ")[1]
            for (j in 0..cuadro.lastIndex) {
                for (k in 0..cuadro[j].lastIndex) {
                    if (cuadro[j][k].toString()==color_original) {
                        cuadro[j][k]=color_nuevo.first()
                    }
                }
            }
        }
//        Bucle impresion
        for (j in 0..cuadro.lastIndex) {
            for (k in 0..cuadro[j].lastIndex) {
                print(cuadro[j][k])
            }
            println()
        }
        entrada= readln()
    }
}