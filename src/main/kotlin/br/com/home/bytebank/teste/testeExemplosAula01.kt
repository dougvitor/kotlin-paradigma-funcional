package br.com.home.bytebank.teste

import br.com.home.bytebank.funcao.PrimeiraFuncao

fun exemplosAula01(){
    val referenciaFuncao: () -> Unit =  ::primeiraFuncao
    println(referenciaFuncao)
    println("${referenciaFuncao()}\n")

    val classeFuncao: () -> Unit = PrimeiraFuncao()
    println(classeFuncao)
    println("${classeFuncao()}\n")

    val classeFuncaoOverloadOperator = PrimeiraFuncao()
    println(classeFuncaoOverloadOperator)
    println("${classeFuncaoOverloadOperator(10)}\n")

    val funcaoLambda: () -> Unit = { println("Executa como Função Lambda") }
    println(funcaoLambda)
    println("${funcaoLambda()}\n")

    val funcaoAnonima: () -> Unit = fun (){ println("Executa como Função Anonima") }
    println(funcaoAnonima)
    println("${funcaoAnonima()}\n")
}

fun primeiraFuncao(): Unit{
    println("Função invocada através de uma referência")
}