fun testaContasDiferentes() {
    val corrente = ContaCorrente(
        numero = "1000",
        titular = "DouglasC"
    )

    val poupanca = ContaPoupanca(
        titular = "AnaP",
        numero = "1001"
    )

    val salario = ContaSalario(
        titular = "HeloisaS",
        numero = "1002"
    )

    salario.deposita(valor = 7900.0)
    salario.saca(valor = 200.0)

    corrente.deposita(valor = 500.00)
    poupanca.deposita(valor = 1000.00)

    corrente.saca(valor = 100.00)
    poupanca.saca(valor = 150.00)

    corrente.tranfere(valor = 50.00, contaDestino = poupanca)
    poupanca.tranfere(valor = 200.00, contaDestino = corrente)
}