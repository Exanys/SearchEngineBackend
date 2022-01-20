package org.exanys.suggester.api

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty,
        port = 8080,
        watchPaths = listOf("classes")
    ) {
        routing {
            get("/"){
                call.respondText(Elastic.getEverything())
            }
        }
    }.start(wait = true)
}