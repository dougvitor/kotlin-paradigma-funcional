class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
):FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    var email: String = ""

    constructor( nome: String,
                 cpf: String,
                 salario: Double,
                 senha: Int,
                 email: String
    ) : this(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha) {
        this.email = email
    }

    override val bonificacao : Double get() =  this.salario

    override fun autentica(senha: Int): Boolean{
        return super<Autenticavel>.autentica(senha = senha)
    }

}