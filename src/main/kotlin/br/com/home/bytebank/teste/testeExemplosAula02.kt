package br.com.home.bytebank.teste

import br.com.home.bytebank.funcao.Soma

fun exemplosAula02(){

    val somatoriaReferencia:(Int, Int) -> Int = ::soma
    println(somatoriaReferencia)
    println("${somatoriaReferencia(38,14)}\n")

    val somatoriaClasse: (Int, Int) -> Int = Soma()
    println(somatoriaClasse)
    println("${somatoriaReferencia(24,82)}\n")

    val somatoriaExpressaoLambda = {a: Int, b: Int -> Int
        a + b
    }
    println(somatoriaExpressaoLambda(24,30))

    val somatoriaExpressaoLambda2: (Int, Int, Int) -> Int = { a, b, _ ->
        a + b
    }
    println(somatoriaExpressaoLambda2(17, 52, 1))

    val somatoriaFuncaoAnonima = fun (a: Int, b: Int): Int{
        return a + b
    }
    println("${somatoriaFuncaoAnonima(55, 82)}\n")

    val calculaBonificacaoLambda: (salario:Double) -> Double = label@{ salario ->
        if(salario > 1000.0){
            return@label salario + 50
        }

        salario + 100
    }
    println(calculaBonificacaoLambda(1001.0))

    val calculaBonificacaoFuncaoAnonima: (salario: Double) -> Double = fun (salario: Double): Double{
        if(salario > 1000.0){
            return salario + 50
        }

        return salario + 100
    }
    println(calculaBonificacaoFuncaoAnonima(1000.0))

}

fun soma(a: Int, b: Int): Int = a + b