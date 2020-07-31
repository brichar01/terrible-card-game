package org.example

import org.example.service.GameHostService

fun main(args: Array<String>) {
    val gameHostService = GameHostService()
    gameHostService.start()
}

