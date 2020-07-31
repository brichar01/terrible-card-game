package com.gamegroup.terriblecardgame

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry

@SpringBootApplication
class TerribleCardGameApplication

fun main(args: Array<String>) {
	runApplication<TerribleCardGameApplication>(*args)
}

@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {
	@Autowired
	lateinit var socketHandler: SocketHandler

	override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
		registry.addHandler(socketHandler, "/app").setAllowedOrigins("*")
	}
}
