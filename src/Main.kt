import entidades.Profissional
import entidades.Servico
import enumeradores.Setor
import java.math.BigDecimal

fun main() {
val instalacao : Servico = Servico(
    nome = "Instalação de Ar Condicionado",
    valor = BigDecimal("1500.00"),
    descricao = "Instalação completa de ar condicionado split, incluindo suporte e tubulação.",
    duracaoHoras = 2,
    duracaoMinutos = 30,
    profissional = Profissional(
        nome = "Carlos Silva",
        idade = 35,
        profissao = "Técnico em Refrigeração",
        especializacao = "Instalação de Ar Condicionado",
        telefone = "11987654321",
        especialidade = TODO(),
        setor = Setor.ADMINISTRATIVO
    )

)


}
