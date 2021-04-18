package br.com.home.bytebank.modelo

interface Transferivel {

    fun tranfere(valor: Double, contaDestino: Conta)

}