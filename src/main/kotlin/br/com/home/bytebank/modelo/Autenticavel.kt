package br.com.home.bytebank.modelo

interface Autenticavel {

    val senha: Int

    fun autentica(senha: Int): Boolean{
        return this.senha == senha
    }
}