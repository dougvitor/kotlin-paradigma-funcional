package br.com.home.bytebank.funcao

class Soma: (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}