package br.com.home.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}