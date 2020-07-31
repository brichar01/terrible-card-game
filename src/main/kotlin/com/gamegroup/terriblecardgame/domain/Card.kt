package com.gamegroup.terriblecardgame.domain

interface Card {
    fun name(): String
    fun health(): Int
    fun attack(): Int
    fun status(): List<Modifier>
    fun effect(action: Actions, target: Field, player: Player): Player
}
