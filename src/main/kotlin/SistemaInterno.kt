class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha = senha)) println("Bem vindo ao Bytebank\n")
        else println("Falha na autenticação\n")
    }
}