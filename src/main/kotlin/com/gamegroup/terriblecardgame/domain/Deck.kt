package com.gamegroup.terriblecardgame.domain


class Deck (
    private val cards: List<Card> = listOf()
) {
    constructor(card: Card): this(listOf(card))

    operator fun plus(deck: Deck): Deck {
        return Deck(cards+deck.cards)
    }

    operator fun plus(card: Card?): Deck {
        val newCards = if(card != null) cards.plus(card) else cards
        return Deck(newCards)
    }

    fun shuffle(): Deck {
        return Deck(cards.shuffled())
    }

    fun drawCard(): Pair<Deck, Card?> {
        return if(cards.isNotEmpty()) {
            Pair(Deck(cards.dropLast(1)), cards.last())
        } else Pair(Deck(), null)
    }
}
