fun mesANumero(mes:String): Int{
    when (mes.lowercase()) {
        "enero" -> return 1
        "febrero" -> return 2
        "marzo" -> return 3
        "abril" -> return 4
        "mayo" -> return 5
        "junio" -> return 6
        "julio" -> return 7
        "agosto" -> return 8
        "septiembre" -> return 9
        "octubre" -> return 10
        "noviembre" -> return 11
        "diciembre" -> return 12
        else -> return 0
    }
}
fun zodiaco(dia:Int, mes: Int):String {
    if (mes==3){
        if (dia>=21) {
            return "Aries"
        }
        else {
            return "Piscis"
        }
    }
    else if (mes==4) {
        if (dia>=20) {
            return "Tauro"
        }
        else {
            return "Aries"
        }
    }
    else if (mes==5) {
        if (dia>=21) {
            return "Geminis"
        }
        else {
            return "Tauro"
        }
    }
    else if (mes==6) {
        if (dia>=21) {
            return "Cancer"
        }
        else {
            return "Geminis"
        }
    }
    else if (mes==7) {
        if (dia>=23) {
            return "Leo"
        }
        else {
            return "Geminis"
        }
    }
    else if (mes==8) {
        if (dia>= 23) {
            return "Virgo"
        }
        else {
            return "Leo"
        }
    }
    else if (mes==9) {
        if (dia>=23) {
            return "Libra"
        }
        else {
            return "Virgo"
        }
    }
    else if (mes==10) {
        if (dia>=23) {
            return "Escorpio"
        }
        else {
            return "Libra"
        }
    }
    else if (mes==11) {
        if (dia>=22) {
            return "Sagitario"
        }
        else {
            return "Escorpio"
        }
    }
    else if (mes==12) {
        if (dia>=22) {
            return "Capricornio"
        }
        else {
            return "Sagitario"
        }
    }
    else if (mes==1) {
        if (dia>=20) {
            return "Acurario"
        }
        else {
            return "Capricornio"
        }
    }
    else {
        if (dia>=19) {
            return "Piscis"
        }
        else {
            return "Acuario"
        }
    }
}
//
//fun main(){
//    println(zodiaco(15, mesANumero("MAYO")))
//    println(zodiaco(21, mesANumero("DICIEMBRE")))
//    println(zodiaco(13, mesANumero("FEBRERO")))
//    println(zodiaco(14, mesANumero("OCTUBRE")))
//    println(zodiaco(16, mesANumero("SEPTIEMBRE")))
//}