package org.example.service

import org.example.domain.Player
import org.example.domain.State

class TerribleCardGameService(private val players: List<Player>) {
    private val gameState: State =

    fun play() {

        players.map { player ->
            player.shuffleDeck().drawCards(5)
        }

    }
}
