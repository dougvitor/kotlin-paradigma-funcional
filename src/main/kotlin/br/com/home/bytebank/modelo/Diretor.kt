package br.com.home.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    plr: Double = salario
): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    var plr: Double = plr
        set(value){
          field = value
        }
        get() = field * 2.5

    override val bonificacao : Double get() =  this.salario + this.plr

    override fun autentica(senha: Int): Boolean{
        return super<FuncionarioAdmin>.autentica(senha)
    }

}