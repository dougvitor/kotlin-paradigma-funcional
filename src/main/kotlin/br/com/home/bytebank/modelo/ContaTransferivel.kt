package br.com.home.bytebank.modelo

import br.com.home.bytebank.exception.FalhaAutenticacaoException
import br.com.home.bytebank.exception.SaldoInsuficienteException
import java.lang.Exception

abstract class ContaTransferivel(
    titular: Cliente,
    numero: String,
    val senha: Int
): Conta(
    titular = titular,
    numero = numero
), Transferivel, Autenticavel by titular{

    @Throws(FalhaAutenticacaoException::class, SaldoInsuficienteException::class) // Interoperabilidade com Java
    override fun tranfere(valor: Double, contaDestino: Conta) {
        println("Transferindo da conta de ${this.titular.nome} para a conta de ${contaDestino.titular.nome} ")

        if (!this.autentica(this.senha)) throw FalhaAutenticacaoException()

        this.saca(valor)
        contaDestino.deposita(valor)
    }

    //by titular delega para o cliente a implementação do autentica
//    override fun autentica(senha: Int): Boolean {
//        return this.senha == senha
//    }

}