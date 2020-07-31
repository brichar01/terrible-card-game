package org.example.domain.factory

import org.example.domain.Card
import org.example.domain.CardLibrary
import org.example.domain.library.GoblinCard

class CardFactory {
    private val cardLibrary = CardLibrary.getAllCards()
    fun getCard(cardName: String): Card {
        return cardLibrary.cardsByName[cardName] ?: GoblinCard()
    }
}
