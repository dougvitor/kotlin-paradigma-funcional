fun testaFuncionarios() {
    val desenvolvedor = Desenvolvedor(
        cpf = "354.851.618-00",
        nome = "Douglas",
        salario = 10500.0
    )

    println("Nome do desenvolvedor: ${desenvolvedor.nome}")
    println("CPF do desenvolvedor: ${desenvolvedor.cpf}")
    println("Salário do desenvolvedor: ${desenvolvedor.salario}")
    println("Bonificação do desenvolvedor: ${desenvolvedor.bonificacao}\n")

    val gerente = Gerente(
        cpf = "111.111.111-11",
        nome = "Athlas",
        senha = 1234,
        salario = 20000.0
    )

    println("Nome do gerente: ${gerente.nome}")
    println("CPF do gerente: ${gerente.cpf}")
    println("Salário do gerente: ${gerente.salario}")
    println("Bonificação do gerente: ${gerente.bonificacao}")
    println("Autenticado: ${gerente.autentica(1234)}\n")

    val diretor = Diretor(
        nome = "Felipe",
        cpf = "333.333.333-33",
        senha = 1235,
        salario = 50000.00,
    )

    println("Nome do diretor: ${diretor.nome}")
    println("CPF do diretor: ${diretor.cpf}")
    println("Salário do diretor: ${diretor.salario}")
    println("Bonificação do diretor: ${diretor.bonificacao}")
    println("Autenticado: ${diretor.autentica(senha = 1234)}")
    println("PLR: ${diretor.plr}\n")

    val analista = Analista(
        cpf = "444.444.444-44",
        nome = "Amanda",
        salario = 11000.0
    )

    println("Nome do analista: ${analista.nome}")
    println("CPF do analista: ${analista.cpf}")
    println("Salário do analista: ${analista.salario}")
    println("Bonificação do analista: ${analista.bonificacao}\n")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(desenvolvedor)
    calculadora.registra(diretor)
    calculadora.registra(gerente)
    calculadora.registra(analista)
    println("Valor total de bonificação: ${calculadora.total}\n")
}