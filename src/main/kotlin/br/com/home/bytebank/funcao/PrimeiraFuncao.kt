package br.com.home.bytebank.funcao

class PrimeiraFuncao: () -> Unit {
    override fun invoke() {
        println("Função invocada através de uma classe")
    }

    operator fun invoke(valor: Int){
        println(valor)
    }


}