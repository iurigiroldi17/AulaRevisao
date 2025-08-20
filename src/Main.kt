import entidades.Cliente
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
    val cliente = Cliente("João", 30, "joao@email.com", "12345678900", "11999999999", "Rua Exemplo, 123")
    val profissional = Profissional("Carlos", "Encanador", "11988888888", 40, "Técnico", "Hidráulica", Setor.MONTAGEM)

    // Cliente paga
    cliente.conta(150.0)

    // Profissional recebe
    profissional.conta(100.0)
}


