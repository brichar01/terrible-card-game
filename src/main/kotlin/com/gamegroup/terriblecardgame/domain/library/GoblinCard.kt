package com.gamegroup.terriblecardgame.domain.library

import com.gamegroup.terriblecardgame.domain.*
import org.example.domain.*

class GoblinCard(
    private val baseName: String = "Goblin",
    private val health: Int = 1,
    private val baseAttack: Int = 1,
    private val status: List<Modifier> = listOf()
): Card {


    override fun name(): String {
        return status().joinToString(" ") + baseName
    }

    override fun health(): Int {
        TODO("Not yet implemented")
    }

    override fun attack(): Int {
        TODO("Not yet implemented")
    }

    override fun status(): List<Modifier> {
        TODO("Not yet implemented")
    }

    override fun effect(action: Actions, target: Field, player: Player): Player {
        TODO("Not yet implemented")
    }

}
