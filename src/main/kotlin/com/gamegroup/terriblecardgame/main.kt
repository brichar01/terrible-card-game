package com.gamegroup.terriblecardgame

import com.gamegroup.terriblecardgame.service.GameHostService

fun main(args: Array<String>) {
    val gameHostService = GameHostService()
    gameHostService.start()
}

