package br.com.home.bytebank.teste

import br.com.home.bytebank.modelo.Endereco

fun testaNulabilidade() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "Rua Itauna", complemento = "apto")

    val logradouro: String? = enderecoNulo?.logradouro

    val tamanho: Int =
        enderecoNulo?.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vázio!")

    println(tamanho)

    enderecoNulo.let { endereco: Endereco ->
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