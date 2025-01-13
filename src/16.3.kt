fun main(){
    var entrada= readln()
    while (entrada!="0 0"){
        val num_soldados=entrada.split(" ")[0].toInt()
        val salto=entrada.split(" ")[1].toInt()
        var indice=0

//        Genera la lista de soldados
        val lista_soldados= mutableListOf<Int>()
//        Se revisa imagen parte de 1 no de 0
        for (i in 1..num_soldados){
            lista_soldados.add(i)
        }
//        println(lista_soldados)

//        Procesa la lista de soldados
        while (lista_soldados.size>1){
            indice+=salto
//            origianlmente un if se dio el caso de que tenía que restar más de una vez
            while (indice > lista_soldados.lastIndex){
                indice=indice-lista_soldados.size
            }
            lista_soldados.removeAt(indice)
        }
        println(lista_soldados[0])






        entrada= readln()
    }
}