package br.com.home.bytebank.modelo

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(admin.autentica(senha = senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
            when (admin) {
                is Diretor -> println("Opções Premium\n")
                is Gerente -> println("Opções Administrador\n")
                else -> println("Opções Comuns\n")
            }
        }else{
            println("Falha na autenticação\n")
        }
    }

    fun entrarReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}){
        if(admin.autentica(senha = senha)) {
            println("Bem vindo ao Bytebank")
            when (admin) {
                is Diretor -> println("Opções Premium\n")
                is Gerente -> println("Opções Administrador\n")
                else -> println("Opções Comuns\n")
            }
            autenticado()
        }else{
            println("Falha na autenticação\n")
        }
    }

    fun efetuarPagamento(){
        println("Pagamento efetuado!")
    }
}