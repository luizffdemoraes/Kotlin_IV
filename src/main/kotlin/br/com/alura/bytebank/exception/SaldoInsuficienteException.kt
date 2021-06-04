package br.com.alura.bytebank.exception

//ctrl + h exibe quais classes herdam de outra
//Throwable tem duas classes que herdam diretamente dele Error e Exception por ser do java não
//funciona os argumento e parametros nomeados
//permitir que a classe receba mensagem
class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente") : Exception(mensagem)