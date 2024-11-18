fun main() {
//    Pedimos al usuario el tiempo
    print("Indique un numero de segundos a convertir: ")
    val tiempo_total= readln().toInt()

//    Calculamos los dias
    val dias = tiempo_total/(60*60*24)
    val segundos_restantes_dia = tiempo_total%(60*60*24)

//    Calculamos las horas
    val horas = segundos_restantes_dia/(60*60)
    val segundos_restante_hora=segundos_restantes_dia%(60*60)

//    Calculamos los minutos
    val minutos = segundos_restante_hora/60
    val segundos_restantes_minutos=segundos_restante_hora%60

//    Devolvemos al usuario su tiempo en segundo en dias, horas, minutos y segundos
    print(tiempo_total.toString()+" segundos= "+dias+" dias, "+horas+" horas, "+minutos+" minutos"+segundos_restantes_minutos+" segundos")

}