class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        println("Registrando a bonificacao de ${funcionario.nome}")
        total += funcionario.bonificacao
    }

}