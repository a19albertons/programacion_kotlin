import kotlin.system.exitProcess

//    Ejemplo linea
//    un extraterrestre se balanceaba, sobre un elefante

fun main() {
//    Petición linea a usuario de texto
    print("Introduzca una frase: ")
    var texto = readln()

//    Denegaciones que da a entender el enunciado
//    Comprobación doble elefante
    var resultado = texto.indexOf("elefante")
    if (resultado==-1) {
        print("No se han detectado al menos 2 elefante en su texto introducido")
        exitProcess(0)
    }
    var elefante2=texto.subSequence(resultado+8,texto.length)
    var resultado2 = elefante2.indexOf("elefante")
    if (resultado2==-1) {
        print("No se han detectado al menos 2 elefante en su texto introducido")
        exitProcess(0)
    }

//    Comprobacion kotlin
    var resultado_kotlin=texto.indexOf("kotlin")
    if (resultado_kotlin!=-1) {
        print("Se ha encontrado la palabra kotlin en su texto")
        exitProcess(0)
    }

//    Busqueda terminos
    var letra = texto.indexOf("e")
    var palabra_permitida = texto.indexOf("elefante")
    var palabra_no_permitida = texto.indexOf("kotlin")

    println("La primera 'e' se encuentra en la posición: "+letra)
    println("La palabra 'elefante' se encuentra en la posición: "+palabra_permitida)
    println("La palabra 'kotlin' no se encuentra en la frase y el valor de indexof es = "+palabra_no_permitida)
}