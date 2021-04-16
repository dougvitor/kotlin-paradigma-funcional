package br.com.home.bytebank.teste

import br.com.home.bytebank.modelo.Funcionario
import br.com.home.bytebank.modelo.Gerente
import novoModelo.Cliente

fun executar(){
    println(anyFunction(1))
    println(anyFunction(1.0))
    println(anyFunction("Qualquer Coisa"))
    println(anyFunction(false))
    println(anyFunction(Cliente(nome = "Jonas Brother", cpf = "555.555.555-55")))
    println(anyFunction(Gerente(nome = "Gensor", cpf = "444.444.444-44", salario = 20000.0, senha = 3895)))
    println()
}

fun anyFunction (anything: Any): Any {
    if (anything is Funcionario || anything is Number) {
        return anything
    }

    return "Não é um tipo válido para o método"
}