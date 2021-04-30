package br.com.home.bytebank.teste

import br.com.home.bytebank.modelo.*

fun exemplosAula05(){

    with(Endereco()){
        logradouro = "Rua Itaua"
        numero = 10
        complemento =  "Apartamento"
        bairro = "Vila Martia"
        cidade = "São Paulo"
        estado =  "SP"
        cep = "00001-001"
        enderecoFormatado()
    }.let { enderecoFormatado ->
        println(enderecoFormatado)
    }

    println()

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Joana", cpf = "333.333.333-00", senha = 1),
        numero = "14222",
        senha = 1
    )

    contaPoupanca.run {
        this.deposita(1000.0)
        this.saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo: Double = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    rendimentoAnual.also { rendimentoAnual: Double ->
        println("Rendimento anual: $rendimentoAnual")
    }

    println()

    somaReceiver(50, 8, resultado = { msg: String ->
        println(msg + this.toDouble())
    })

    println()

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrarReceiver(
        admin = Gerente(
            cpf = "111.111.111-11",
            nome = "Athlas",
            senha = 1234,
            salario = 20000.0
        ),
        senha = 1234,
        autenticado = {
            println("Realizando o processamento...")
            this.efetuarPagamento()
        }
    )

}

fun somaReceiver(a: Int, b: Int, resultado: Int.(String) -> Unit): Unit{
    println("Soma iniciada...")
    val total = a + b
    total.resultado("Resultado da soma é: ")
    println("Soma finalizada!")
}



