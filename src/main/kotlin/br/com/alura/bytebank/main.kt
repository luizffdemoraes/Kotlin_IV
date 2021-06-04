package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco


fun main() {
    //chamada de safe call
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro

    //recursos similares safecall com let
    enderecoNulo?.let {
        println(it.logradouro.length)
        //Elvis Operator é uma sintax shugar
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
//        val tamanhoComplemento: Int = it.complemento?.length ?: 0 //devolve 0 caso seja vazio ou length caso não seja null
        println(tamanhoComplemento)
    }
    teste("")
//    teste(1)
}

//Safe Cast
//evitamos exception
fun teste(valor:Any){
    val numero: Int? = valor as? Int
    println(numero)
}

    //chamada de safecall com let
//    enderecoNulo = null
    //função de escopo usando o safe call ? para não ter que ficar fazendo conversão usando o ?
//    enderecoNulo?.let { endereco: Endereco ->
//        println(endereco.logradouro)


//    teste(enderecoNulo)


//fun teste(endereco: Endereco){}

//    Chamada encadeada
//    println(enderecoNulo?.logradouro?.length?.toUByte())
//    shift + f6 renomear em dois pontos
//    Variaveis que podem receber null para é necessario utilizar ?
//    transforma em um endereço que não null -> !! isso torna ele valido
//    val enderecoNaoNulo: Endereco =  enderecoNulo!!
//    enderecoNaoNulo.logradouro



