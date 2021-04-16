package br.com.home.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: String,
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        println("Sacando da conta de ${this.titular.nome}")
        when {
            this.saldo < valor -> println("Não foi possivel sacar. Saldo insuficiente!")
            else -> {
                this.saldo -= valor
                println("Novo saldo da conta de ${this.titular.nome}: ${this.saldo}\n")
            }
        }
    }

}