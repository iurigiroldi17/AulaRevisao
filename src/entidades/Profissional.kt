package entidades

import enumeradores.Setor

class Profissional(
    nome: String,
    especialidade: String,
    telefone: String,
    idade: Int,
    profissao: String,
    especializacao: String,
    val setor : Setor
)

{
    fun instalarCaixaDAgua(clt : Profissional) {
        if(clt.setor.equals(Setor.MONTAGEM)){
            println("Instalação de caixa d'água realizada com sucesso!")
        } else {
            println("O profissional não está no setor administrativo, não é possível realizar a instalação.")
        }
    }
}



