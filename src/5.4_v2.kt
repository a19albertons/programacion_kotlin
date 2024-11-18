fun imprimirT(valor:Int) {

    funcionL(valor)
    if (valor>0) {
        System.out.write(10)
        imprimirT(valor-1)
    }
}
fun funcionL (valorL:Int) {
    if (valorL>0) {
//        Solucion dada por ChatGPT
//        como alternativa a los print
//        convencinales que dan error
        System.out.write(42)
        funcionL(valorL-1)
    }
}
