fun testaExpressao() {
    val entrada: String = "1.9"

    //abordagem de trabalhar com valores imutaveis
    //utilização da expressão try
    // ? significa que e um double que pode ser nulo
    val valorRecebido: Double? = try {
        entrada.toDouble() //metodo de conversão
    } catch (e: NumberFormatException) {
        println("problema na conversão")
        e.printStackTrace()
        null
    }

    //utilização da expressão if e else
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }
}