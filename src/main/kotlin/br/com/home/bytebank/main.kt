import br.com.home.bytebank.modelo.Cliente
import br.com.home.bytebank.modelo.Endereco
import br.com.home.bytebank.teste.executar

fun main(){

    testaAutenticacao()
    testaFuncionarios()
    testaContasDiferentes()
    executar()

    val enderecoAntigo = Endereco(logradouro = "Rua Itauna", numero = 1050)
    val enderecoAtual = Endereco(logradouro = "Rua Itauna", numero = 1050)
    println(enderecoAntigo)
    println("${enderecoAntigo.javaClass}@${Integer.toHexString(enderecoAntigo.hashCode())}\n")

    println("$enderecoAntigo")
    println("$enderecoAtual\n")

    println(enderecoAntigo.equals(enderecoAtual))
    println(enderecoAtual.hashCode().equals(enderecoAntigo.hashCode()))
    println(enderecoAntigo.equals(Cliente(nome = "Juão", cpf = "355.555.555-00", senha = 1)))


}








