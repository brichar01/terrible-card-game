package org.example.domain.factory

import org.example.domain.Deck

class DeckFactory {
    private val standardDeckList = (1..10).map {
        CardFactory().getCard("goblin")
    }

    fun getStandardDeck(): Deck {
        return Deck(standardDeckList)
    }
}
