package org.example.domain.factory

import org.example.domain.Deck
import org.example.domain.Field
import org.example.domain.Player

class PlayerFactory {
    fun getPlayer(deck: Deck = Deck()): Player {
        return Player(Deck(), deck, Deck(), Field())
    }
}
