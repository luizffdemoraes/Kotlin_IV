package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco


fun main() {
    //chamada de safe call
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    //chamada de safecall com let
//    enderecoNulo = null
    //função de escopo usando o safe call ? para não ter que ficar fazendo conversão usando o ?
//    enderecoNulo?.let { endereco: Endereco ->
//        println(endereco.logradouro)

    //recrusos similares
    enderecoNulo?.let {
        println(it.logradouro.length)
    }

//    teste(enderecoNulo)
}

//fun teste(endereco: Endereco){}

//    Chamada encadeada
//    println(enderecoNulo?.logradouro?.length?.toUByte())
//    shift + f6 renomear em dois pontos
//    Variaveis que podem receber null para é necessario utilizar ?
//    transforma em um endereço que não null -> !! isso torna ele valido
//    val enderecoNaoNulo: Endereco =  enderecoNulo!!
//    enderecoNaoNulo.logradouro



