package org.example.domain

import org.example.domain.library.GoblinCard

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
