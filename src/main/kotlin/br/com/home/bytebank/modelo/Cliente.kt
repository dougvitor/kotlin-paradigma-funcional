package br.com.home.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int,
    var endereco : Endereco = Endereco()
): Autenticavel {

    override fun autentica(senha: Int): Boolean{
        return this.senha == senha
    }

}