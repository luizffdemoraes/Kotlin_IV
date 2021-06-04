package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco


//Variaveis que podem receber null para é necessario utilizar ?
fun main() {
    //shift + f6 renomear em dois pontos
    var enderecoNulo: Endereco? = null
    //transforma em um endereço que não null -> !! isso torna ele valido
    val enderecoNaoNulo: Endereco =  enderecoNulo!!
    enderecoNaoNulo.logradouro
}



