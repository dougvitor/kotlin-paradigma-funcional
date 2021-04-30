package br.com.home.bytebank.teste

import br.com.home.bytebank.modelo.Endereco

fun exemplosAula03(){

    Endereco(
        logradouro = "Rua Itauna",
        numero = 1050,
        complemento = "76B"
    ).let{endereco ->
        println(endereco.logradouro.toUpperCase())
    }

    val enderecos = listOf(
        Endereco(logradouro = "Rua Catumbi"),
        Endereco(logradouro = "Braz Leme", complemento = "casa"),
        Endereco(logradouro = "Rua Dr. Cesar"),
        Endereco(logradouro = "Praça da Arvore", complemento = "Arvore")
    )

    enderecos
//        .filterNot (predicate = { endereco: Endereco -> endereco.complemento.isNullOrBlank() })
        .filterNot { endereco: Endereco -> endereco.complemento.isNullOrBlank() }
        .let (block = ::println)

    soma(50, 8, resultado = ::println)
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit): Unit{
    println("Soma iniciada...")
    resultado(a + b)
    println("Soma finalizada!")
}