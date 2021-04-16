package br.com.home.bytebank.modelo

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha = senha)) {
            println("Bem vindo ao Bytebank")
            when (admin) {
                is Diretor -> println("Opções Premium\n")
                is Gerente -> println("Opções Administrador\n")
                else -> println("Opções Comuns\n")
            }
        }else{
            println("Falha na autenticação\n")
        }
    }
}