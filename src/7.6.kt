fun main() {
    val num_veces = readln().toInt()
    for (i in 1..num_veces) {
        var texto = readln()
        var se_busca = readln()
        var texto_procesado=texto.lowercase().replace(" ","")
        var se_busca_procesado=se_busca.lowercase().replace(" ","")
        var j=0
        for (i in texto_procesado) {

            if (se_busca_procesado[j] == i) {
                j++
                if (se_busca_procesado.length==j) {
                    break
                }
            }
        }
        if (se_busca_procesado.length == j) {
            println("SI")
        }
        else {
            println("NO")
        }
    }
}