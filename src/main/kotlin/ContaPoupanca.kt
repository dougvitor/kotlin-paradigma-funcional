class ContaPoupanca(
    titular: String,
    numero: String,
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        println("Sacando da Canto do ${this.titular}")
        when {
            this.saldo < valorComTaxa -> println("Não foi possivel sacar. Saldo insuficiente!")
            else -> {
                this.saldo -= valorComTaxa
                println("Novo saldo da conta de ${this.titular}: ${this.saldo}\n")
            }
        }
    }

}