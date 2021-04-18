package br.com.home.bytebank.exception

class SaldoInsuficienteException(message: String = "O saldo da conta é insuficiente"): Exception(message)