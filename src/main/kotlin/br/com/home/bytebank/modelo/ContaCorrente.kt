package br.com.home.bytebank.modelo

import br.com.home.bytebank.exception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: String,
    senha: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero,
    senha = senha
) {

    @Throws(SaldoInsuficienteException::class)
    override fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular.nome}")
        when {
            this.saldo < valor -> throw SaldoInsuficienteException("O saldo da conta é insuficiente! Tentando sacar $valor porém o saldo atual é de ${this.saldo}")
            else -> {
                this.saldo -= valor
                println("Novo saldo da conta de ${this.titular.nome}: ${this.saldo}\n")
            }
        }
    }

}