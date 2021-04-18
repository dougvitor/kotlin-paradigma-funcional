package br.com.home.bytebank

import br.com.home.bytebank.modelo.Endereco
import br.com.home.bytebank.teste.testaTryIfExpression
import testaAutenticacao
import testaContasDiferentes

fun main() {

    testaTryIfExpression()

    testaContasDiferentes()

    val enderecoNulo: Endereco? = Endereco(logradouro = "Rua Itauna", complemento = "apto")

    val logradouro: String? = enderecoNulo?.logradouro

    val tamanho: Int = enderecoNulo?.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vázio!")

    println(tamanho)

    enderecoNulo.let {endereco: Endereco ->
        println(endereco.logradouro)
    }

    val enderecoNaoNulo: Endereco = enderecoNulo!!

    enderecoNaoNulo.complemento
    enderecoNaoNulo.let {
        println(it.complemento)
    }

    val numero: Any = "abc"
    println(numero as? Int)

}








