package com.gamegroup.terriblecardgame.domain.factory

import com.gamegroup.terriblecardgame.domain.Deck
import com.gamegroup.terriblecardgame.domain.Field
import com.gamegroup.terriblecardgame.domain.Player

class PlayerFactory {
    fun getPlayer(deck: Deck = Deck()): Player {
        return Player(Deck(), deck, Deck(), Field())
    }
}
