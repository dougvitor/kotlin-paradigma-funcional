package br.com.home.bytebank.exception

class FalhaAutenticacaoException(message: String = "Senha informada está incorreta!"): Exception(message)