package entidades

class Cliente(
    val nome: String,
    val idade: Int,
    val email: String,
    val cpf: String,
    val telefone: String,
    val endereco: String
) {
    val conta = Conta()

    fun conta(valor: Double) {
        println("Cliente ${nome} realizando pagamento de R$%.2f".format(valor))
        conta.depositar(valor)
    }
}

private fun Conta.depositar(valor: Double) {
    TODO("Not yet implemented")
}
