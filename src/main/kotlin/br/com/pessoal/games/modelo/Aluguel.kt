package br.com.pessoal.games.modelo

import org.example.br.com.pessoal.games.modelo.Jogo

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo,
    val periodo: Periodo
) {
    val valorDoAluguel = gamer.plano.obterValor(this)
    var id = 0
    override fun toString(): String {
        return "Aluguel do ${jogo.titulo} por ${gamer.nome} pelo valor R$$valorDoAluguel"
    }
}
