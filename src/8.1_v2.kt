fun copiarLista1(lista1: List<Int>, lista2: MutableList<Int>) {
    for (i in 0..lista1.size-1) {
        lista2.add(lista1[i])
    }
}
fun copiarLista2(lista1: List<Int>): List<Int>{
    return lista1
}
//fun main(){
//    val listaOrigen = listOf(1, 2, 3, 4, 5)
//    val listaDestino1 = mutableListOf<Int>()
//    val listaDestino2: List<Int>
//    copiarLista1(listaOrigen, listaDestino1)
//    println(listaDestino1)
//    listaDestino2 = copiarLista2(listaOrigen)
//    println(listaDestino2)
//}