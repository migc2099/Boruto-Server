package com.migc.plugins

import com.migc.routes.getALlHeroes
import com.migc.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        root()
        getALlHeroes()
    }
}
