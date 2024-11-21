fun main() {
//    entrada por teclado
    val num_horas_trabajada = readln().toFloat()
    val precio_hora_trabajada = readln().toFloat()
    var sueldo_total:Float
    var salario_calculado:Float

//    Calculo sueldo
    if (num_horas_trabajada > 35.0) {
        val num_horas_extra = num_horas_trabajada-35.0
        val sueldo1 = 35.0*precio_hora_trabajada
        val sueldo2 = num_horas_extra*precio_hora_trabajada*1.5
        sueldo_total = (sueldo1 + sueldo2).toFloat()
    }
    else {
        sueldo_total = num_horas_trabajada * precio_hora_trabajada
    }

//    Sueldo tras impuestos
    if (sueldo_total>900) {
        val sueldo45 = sueldo_total - 900
        val reducir45 = sueldo45*0.45
        val sueldo25 = 900-400
        val reducir25 = sueldo25*0.25
        salario_calculado = (sueldo_total-reducir45-reducir25).toFloat()
    }
    else if (sueldo_total > 500) {
        val sueldo25 = sueldo_total - 500
        val reducir25 = sueldo25 * 0.25
        salario_calculado = (sueldo_total - reducir25).toFloat()
    }
    else {
        salario_calculado = sueldo_total
    }
    println(salario_calculado)
}