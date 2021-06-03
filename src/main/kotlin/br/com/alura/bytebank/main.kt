package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.ClassCastException

fun main() {
    println("início main")
//    try {
//        10 / 0
//    } catch (e: ArithmeticException) {
//        println("ArithmeticException foi encontrada no codigo")
//    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
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


