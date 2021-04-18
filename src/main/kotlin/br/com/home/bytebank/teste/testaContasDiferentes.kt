import br.com.home.bytebank.exception.FalhaAutenticacaoException
import br.com.home.bytebank.exception.SaldoInsuficienteException
import br.com.home.bytebank.modelo.*

fun testaContasDiferentes() {
    val corrente = ContaCorrente(
        numero = "1000",
        titular = Cliente(
            nome = "DouglasC",
            cpf = "123.456.789-00",
            senha = 1234
        ),
        senha = 1234
    )

    val poupanca = ContaPoupanca(
        titular = Cliente(
            nome = "AnaP",
            cpf = "111.111.111-11",
            senha = 5678
        ),
        numero = "1001",
        senha = 1234
    )

    val salario = ContaSalario(
        titular = Cliente(
            nome = "HeloisaS",
            senha = 3334,
            cpf = "888.888.888-88",
            endereco = Endereco(logradouro = "Rua Itaúna")
        ),
        numero = "1002"
    )

    salario.deposita(valor = 7900.0)
    salario.saca(valor = 200.0)

    corrente.deposita(valor = 500.00)
    poupanca.deposita(valor = 1000.00)

    corrente.saca(valor = 100.00)
    poupanca.saca(valor = 150.00)

    try{
        corrente.tranfere(valor = 10000.00, contaDestino = poupanca)
        println("Transferência realizada com sucesso!")
    }catch(e: SaldoInsuficienteException){
        println("Falha na Transferência: ${e.message}")
        e.printStackTrace()
    }catch(e: FalhaAutenticacaoException){
        println("Falha na Transferência: ${e.message}")
        e.printStackTrace()
    }

    try{
        poupanca.tranfere(valor = 200.00, contaDestino = corrente)
        println("Transferência realizada com sucesso!")
    }catch(e: SaldoInsuficienteException){
        e.printStackTrace()
        println("Falha na Transferência: ${e.message}")
    }catch(e: FalhaAutenticacaoException){
        println("Falha na Transferência: ${e.message}")
        e.printStackTrace()
    }

    println("Instancia de titular: ${salario.titular}")
    println("Nome do titular: ${salario.titular.nome}")
    println("CPF do titular: ${salario.titular.cpf}")
    println("Instancia do endereço do titular: ${salario.titular.endereco}")
    println("Logradouro do Titular: ${salario.titular.endereco.logradouro}\n")

    println("Total de contas criadas: ${Conta.total}\n")
}