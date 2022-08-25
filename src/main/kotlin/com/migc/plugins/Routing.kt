package com.migc.plugins

import com.migc.routes.getALlHeroes
import com.migc.routes.root
import com.migc.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        getALlHeroes()
        searchHeroes()

        static("/images"){
            resources("images")
        }
    }
}
