package org.example.service

import org.example.domain.factory.PlayerFactory
import org.example.domain.factory.DeckFactory

class GameHostService {
    private val decks =  (1..2).map { DeckFactory().getStandardDeck() }
    private val players = decks.map { PlayerFactory().getPlayer(it) }
    private val goFishService = TerribleCardGameService(players)

    fun start() {
        goFishService.play()
    }

}
