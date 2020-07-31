package com.gamegroup.terriblecardgame.domain.factory

import com.gamegroup.terriblecardgame.domain.Card
import com.gamegroup.terriblecardgame.domain.CardLibrary
import com.gamegroup.terriblecardgame.domain.library.GoblinCard

class CardFactory {
    private val cardLibrary = CardLibrary.getAllCards()
    fun getCard(cardName: String): Card {
        return cardLibrary.cardsByName[cardName] ?: GoblinCard()
    }
}
