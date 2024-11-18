fun main() {
    var frase = readln()
    while (frase != "XXX") {
        val frase_sin_espacios_minuscula=frase.replace(" ","").lowercase()

        var inversion = StringBuilder()
        for (item in frase_sin_espacios_minuscula.length-1 downTo 0) {
            inversion.append(frase_sin_espacios_minuscula[item])
        }
        if (frase_sin_espacios_minuscula==inversion.toString()) {
            println("SI")
        }
        else {
            println("NO")
        }

        frase = readln()
    }
}