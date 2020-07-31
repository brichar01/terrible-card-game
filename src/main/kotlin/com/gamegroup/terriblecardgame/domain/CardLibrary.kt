package com.gamegroup.terriblecardgame.domain

import com.gamegroup.terriblecardgame.domain.library.GoblinCard

data class CardLibrary(
    val cardsByName: Map<String, Card>
) {
    companion object {
        private val allCards = CardLibrary(mapOf(
            "goblin" to GoblinCard()
        ))

        fun getAllCards(): CardLibrary {
            return allCards
        }
    }
}
