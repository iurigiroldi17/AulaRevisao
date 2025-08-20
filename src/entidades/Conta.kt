package entidades

class Conta {
    
    class Conta(var saldo: Double = 0.0) {

        fun depositar(valor: Double) {
            saldo += valor
            println("Depósito de R$%.2f realizado com sucesso. Saldo atual: R$%.2f".format(valor, saldo))
        }

        fun sacar(valor: Double) {
            if (valor <= saldo) {
                saldo -= valor
                println("Saque de R$%.2f realizado com sucesso. Saldo atual: R$%.2f".format(valor, saldo))
            } else {
                println("Saldo insuficiente. Saldo atual: R$%.2f".format(saldo))
            }
        }
    }

}