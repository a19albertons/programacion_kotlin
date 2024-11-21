// Habilita funciones experimentales del lenguaje
// (el del server es más viejo que el del anfitrion)
@OptIn(kotlin.ExperimentalStdlibApi::class)

fun main(){
//    Se pide la calificacion
    val calificacion = readln().toInt()

//    switch de las calificaciones
    when {
        calificacion in 90..100 -> println("La calficación es A")
        calificacion >= 80 && calificacion < 90 -> println("La calificación es B")
        calificacion >= 70 && calificacion < 80 -> println("La calificación es C")
        calificacion >= 0 && calificacion < 70 -> println("La calificación es D")
        else -> println("La calificación es X")
    }
}