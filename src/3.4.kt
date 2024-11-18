import kotlin.system.exitProcess

fun main() {
//    Pedimos variables primero pizzas despues amigos
    var pizzas= readln().toInt()
    var amigos= readln().toInt()

//    Procesamos las pizzas
    while (pizzas!=0) {

        if (amigos%pizzas != 0) {
            println("PELEA")
        }
        else {
            println(amigos/pizzas)
        }

        pizzas= readln().toInt()
        if (pizzas==0) {
            exitProcess(0)
        }
        amigos= readln().toInt()
    }
}