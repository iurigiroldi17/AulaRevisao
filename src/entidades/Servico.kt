package entidades

import entidades.Profissional
import java.math.BigDecimal

class Servico(
    nome: String,
    valor: BigDecimal,
    descricao: String,
    duracaoHoras: Int,
    duracaoMinutos: Int,
    profissional: Profissional
) {

}