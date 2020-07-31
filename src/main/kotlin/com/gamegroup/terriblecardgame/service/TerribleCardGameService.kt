package com.gamegroup.terriblecardgame.service

import com.gamegroup.terriblecardgame.domain.Player
import com.gamegroup.terriblecardgame.domain.State

class TerribleCardGameService(private val players: List<Player>) {
    private val gameState: State = State(true)

    fun play() {
        players.map { player ->
            player.shuffleDeck().drawCards(5)
        }
    }
}
