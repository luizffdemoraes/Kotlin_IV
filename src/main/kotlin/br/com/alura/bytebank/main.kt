package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import testaExpressao
import java.lang.ClassCastException

fun main() {
    println("início main")
//    teste()
    funcao1()
    println("fim main")
}

//recrusão infinita teremos problema ela chama ela mesma sem ponto de parada
//fun teste(){
//    return teste()
//}


fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println(e.printStackTrace()) //nela temos as 3 informações e.cause / e.stackTrace / e.message
        println("ClassCastException foi encontrada no codigo")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
       throw SaldoInsuficienteException()

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


