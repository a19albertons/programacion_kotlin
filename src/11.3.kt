fun main(){
    var nombre_categoria= readln()
    while (nombre_categoria!="FIN") {
        var linea_resultados= readln()
        val clasificación= mutableMapOf<String, Int>()
        var partidos_jugados=0
        while (linea_resultados!="FIN") {
            partidos_jugados+=1
            val linea_resultados_dividida=linea_resultados.split(" ")
            val nombre_local=linea_resultados_dividida[0]
            val resultado_local=linea_resultados_dividida[1].toInt()
            val nombre_visitante=linea_resultados_dividida[2]
            val resultado_visitante=linea_resultados_dividida[3].toInt()

            if (resultado_local>resultado_visitante) {
                if (nombre_local !in clasificación) {
                    clasificación[nombre_local]=2
                }
                else {
                    clasificación[nombre_local]=clasificación[nombre_local]!!+2
                }
                if (nombre_visitante !in clasificación) {
                    clasificación[nombre_visitante] = 1
                } else {
                    clasificación[nombre_visitante] = clasificación[nombre_visitante]!! + 1
                }
            }
            else {
                if (nombre_local !in clasificación) {
                    clasificación[nombre_local] = 1
                } else {
                    clasificación[nombre_local] = clasificación[nombre_local]!! + 1
                }
                if (nombre_visitante !in clasificación) {
                    clasificación[nombre_visitante] = 2
                } else {
                    clasificación[nombre_visitante] = clasificación[nombre_visitante]!! + 2
                }
            }








            linea_resultados= readln()
        }
        val valor_alto = clasificación.values.max()
        val primeros=clasificación.filterValues { it == valor_alto }.keys.toList()
        if (primeros.size>1){
            print("EMPATE")
        }
        else {
            print(primeros[0])
        }
        print(" ")
        val num_equipos=clasificación.size
        val num_partidos_totales=(clasificación.size-1)*2*num_equipos/2
        val diferencia=num_partidos_totales-partidos_jugados
        print(diferencia)
        println()




        nombre_categoria= readln()
    }
}