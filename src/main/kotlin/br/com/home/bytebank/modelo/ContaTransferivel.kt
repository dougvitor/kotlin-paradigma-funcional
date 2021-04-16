package br.com.home.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numero: String,
): Conta(
    titular = titular,
    numero = numero
), Transferivel {

    override fun tranfere(valor: Double, contaDestino: Conta): Boolean {
        println("Transferindo da conta de ${this.titular.nome} para a conta de ${contaDestino.titular.nome} ")

        if (this.saldo < valor) return false

        this.saca(valor)
        contaDestino.deposita(valor)

        return true
    }

}