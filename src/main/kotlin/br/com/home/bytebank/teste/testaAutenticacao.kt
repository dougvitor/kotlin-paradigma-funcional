import br.com.home.bytebank.modelo.*
import novoModelo.Cliente as NovoCliente

fun testaAutenticacao() {
    val gerente = Gerente(
        cpf = "111.111.111-11",
        nome = "Athlas",
        senha = 1234,
        salario = 20000.0
    )

    val diretor = Diretor(
        nome = "Felipe",
        cpf = "333.333.333-33",
        senha = 1235,
        salario = 50000.00,
    )

    val cliente = Cliente(
        nome = "Joseph",
        cpf = "555.555.555-55",
        senha = 5678
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(admin = gerente, senha = 1234)
    sistemaInterno.entrar(senha = 1234, admin = diretor)
    sistemaInterno.entrar(admin = cliente, senha = 5678)

    //Object expressions
    val novoCliente = object: Autenticavel{
        val nome = "Martinho"
        val cpf = "777.777.777-77"
        var senha = 1234

        override fun autentica(senha: Int): Boolean {
            println("Nova implementação do autentica")
           return this.senha == senha
        }
    }

    println("Object autenticavel: autentica ${novoCliente.autentica(senha = 1001)}\n")
}