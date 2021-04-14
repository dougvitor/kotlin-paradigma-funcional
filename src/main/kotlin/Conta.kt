abstract class Conta (
             val titular: String,
             var numero: String,
             val gerente: String = "Default"
) {
    //    var titular = titular
    //    var numero = numero
    var saldo = 0.0
        protected set

//    constructor(titular: String, numero: String){
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        println("Depositando na Conta do ${this.titular}")

        if (valor < 0) println("Valor atribuido não pode ser negativo")
        else {
            this.saldo += valor
            println("Novo saldo da conta de ${this.titular}: ${this.saldo}\n")
        }

    }

    abstract fun saca(valor: Double)


//    fun getSaldo(): Double{
//        return this.saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor < 0) println("Valor atribuido não pode ser negativo")
//        else this.saldo = valor
//    }

}
