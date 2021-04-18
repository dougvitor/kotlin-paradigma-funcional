package br.com.home.bytebank.modelo

import br.com.home.bytebank.exception.SaldoInsuficienteException

class ContaPoupanca(
   titular: Cliente,
    numero: String,
     senha: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero,
    senha = senha
){

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        println("Sacando da conta de ${this.titular.nome}")
        when {
            this.saldo < valorComTaxa -> throw SaldoInsuficienteException()
            else -> {
                this.saldo -= valorComTaxa
                println("Novo saldo da conta de ${this.titular.nome}: ${this.saldo}\n")
            }
        }
    }

}