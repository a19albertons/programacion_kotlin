fun main(){
    var hora= readln()
    while (hora!="00:00") {
        val division_hora=hora.split(":")
        val horas=division_hora[0].toInt()
        val minutos=division_hora[1].toInt()
        println(60*(23-horas)+(60-minutos))





        hora= readln()
    }
}