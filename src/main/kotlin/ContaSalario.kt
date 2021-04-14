class ContaSalario(
    titular: String,
    numero: String,
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        println("Sacando da Canto do ${this.titular}")
        when {
            this.saldo < valor -> println("Não foi possivel sacar. Saldo insuficiente!")
            else -> {
                this.saldo -= valor
                println("Novo saldo da conta de ${this.titular}: ${this.saldo}\n")
            }
        }
    }

}