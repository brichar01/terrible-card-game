package com.gamegroup.terriblecardgame.service

import com.gamegroup.terriblecardgame.domain.factory.PlayerFactory
import com.gamegroup.terriblecardgame.domain.factory.DeckFactory

class GameHostService {
    private val decks =  (1..2).map { DeckFactory().getStandardDeck() }
    private val players = decks.map { PlayerFactory().getPlayer(it) }
    private val goFishService = TerribleCardGameService(players)

    fun start() {
        goFishService.play()
    }

}
