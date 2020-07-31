package com.gamegroup.terriblecardgame.domain

class Player constructor(
        private val hand: Deck,
        private val deck: Deck,
        private val graveyard: Deck,
        private val field: Field
) {
    constructor(
            player: Player,
            newHand: Deck? = null,
            newDeck: Deck? = null,
            newGraveyard: Deck? = null,
            newField: Field? = null
    ) {
        val hand = newHand ?: player.hand
        val deck = newDeck ?: player.deck
        val graveyard = newGraveyard ?: player.graveyard
        val field = newField ?: player.field

        Player(hand, deck, graveyard, field)
    }

    fun drawCards(numberOfCards: Int): Player {
        var newPlayer = Player(this)
        (1..numberOfCards).forEach { _ ->
            val ( newDeck, card ) = deck.drawCard()
            newPlayer = Player(newPlayer, hand+card, newDeck)
        }
        return newPlayer
    }

    fun drawCard(): Player {
        return drawCards(1)
    }

    fun shuffleDeck(): Player {
        return Player(this, newDeck = deck.shuffle())
    }
}
