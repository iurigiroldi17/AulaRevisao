package entidades

import enumeradores.Setor

class Profissional(
    val nome: String,
    val especialidade: String,
    val telefone: String,
    val idade: Int,
    val profissao: String,
    val especializacao: String,
    val setor: Setor
) {
    val conta = Conta()

    fun instalarCaixaDAgua(clt: Profissional) {
        if (clt.setor == Setor.MONTAGEM) {
            println("Instalação de caixa d'água realizada com sucesso!")
        } else {
            println("O profissional não está no setor de montagem, não é possível realizar a instalação.")
        }
    }

    fun conta(valor: Double) {
        println("Profissional ${nome} recebendo pagamento de R$%.2f".format(valor))
        conta.sacar(valor)
    }
}

private fun Conta.sacar(valor: Double) {}




