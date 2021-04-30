package br.com.home.bytebank.teste

import br.com.home.bytebank.modelo.Endereco

fun exemplosAula04(){

    val endereco = run {
        Endereco(
            logradouro = "Rua Itauna",
            numero = 1050,
            complemento = "76B"
        )
    }

    endereco.also{
        println("Convertendo o endereço em letras maiúsculas: $it")
    }.let{ enderecoAConverter: Endereco ->
        "${enderecoAConverter.logradouro}, ${enderecoAConverter.numero}".toUpperCase()
    }.also { println("Endereco em letras maiúsculas: $it") }

    endereco.apply {
        logradouro = "Rua Curuça"
        numero =  1
        complemento = "Predio"
    }.also{
        println("Novo logradouro: ${it.logradouro}")
    }

    with(endereco){
        "${logradouro}, ${numero}".toUpperCase()
    }.also { println("Novo logradouro em letras maíusculas: $it") }
}