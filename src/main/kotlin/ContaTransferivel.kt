abstract class ContaTransferivel(
    titular: String,
    numero: String,
):Conta(
    titular = titular,
    numero = numero
), Transferivel {

    override fun tranfere(valor: Double, contaDestino: Conta): Boolean {
        println("Transferindo da Conta do(a) ${this.titular} para a conta do(a) ${contaDestino.titular} ")

        if (this.saldo < valor) return false

        this.saca(valor)
        contaDestino.deposita(valor)

        return true
    }

}