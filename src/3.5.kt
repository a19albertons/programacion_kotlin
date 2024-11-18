fun main() {
//    Creamos una variable de control
    var i = 0

//    Creamos un bucle for que va comprobado que la
//    variable de control
//    no llege a 9 si no la reincia y salta la linea
    for(item in 0..99) {
        val numeros = (item * item).toString().padStart(4,'0')
        print(numeros)

        if (i<9) {
            i++
            print("  ")
        }
        else {
            i=0
            print("\n")
        }
    }
}