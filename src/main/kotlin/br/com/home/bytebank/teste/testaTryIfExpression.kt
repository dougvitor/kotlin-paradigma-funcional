package br.com.home.bytebank.teste

fun testaTryIfExpression() {
    val entrada: String = "a"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val msg: String = when (valorRecebido) {
        null -> "Valor inválido"
        else -> "Valor válido"
    }

    println(msg)
}