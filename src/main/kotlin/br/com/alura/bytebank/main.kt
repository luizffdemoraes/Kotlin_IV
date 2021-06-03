package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.ClassCastException

fun main() {
    println("início main")
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
    val valorComTaxa: Double? = if(valorRecebido != null){
        valorRecebido + 0.1
    }else{
        null
    }

    if(valorComTaxa  != null){
        println("Valor recebido: $valorComTaxa")
    }else{
        println("Valor inválido")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
//        println(e.message)
//        println(e.stackTrace)
//        println(e.cause)
        println(e.printStackTrace()) //nela temos as 3 informações acima
        println("ClassCastException foi encontrada no codigo")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco

    }
    println("fim funcao2")
}

//var valorRecebido: Double = 0.0

//try {
//    // val valor: Double = entrada.toDouble() //metodo de conversão
//    valorRecebido = entrada.toDouble()
//    println("valor recebido: $valorRecebido")
//} catch (e: NumberFormatException) {
//    println("problema na conversão")
//    e.printStackTrace()
//}
//
//println("Valor recebido: $valorRecebido ")


//    try {
//        10 / 0
//    } catch (e: ArithmeticException) {
//        println("ArithmeticException foi encontrada no codigo")
//    }

//try {
//    for (i in 1..5) {
//        println(i)
//        val endereco = Any()
//        endereco as Endereco
//    }
//} catch (e: ClassCastException) {
//    println("ClassCastException foi encontrada no codigo")
//}

//Comportamento try dentro do for
//        try{
//            endereco as Endereco
//        } catch (e: ClassCastException) {
//            println("ClassCastException foi encontrada no codigo")
//        }


