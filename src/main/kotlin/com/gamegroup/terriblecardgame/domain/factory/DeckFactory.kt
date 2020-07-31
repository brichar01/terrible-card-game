package com.gamegroup.terriblecardgame.domain.factory

import com.gamegroup.terriblecardgame.domain.Deck

class DeckFactory {
    private val standardDeckList = (1..10).map {
        CardFactory().getCard("goblin")
    }

    fun getStandardDeck(): Deck {
        return Deck(standardDeckList)
    }
}
