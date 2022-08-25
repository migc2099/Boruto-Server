package com.migc.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import javax.naming.AuthenticationException


fun Application.configureStatusPage() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, status ->
            call.respond(
                message = "404 Page not found",
                status = status
            )
        }
//        Example of exception
//        exception<AuthenticationException> { call, cause ->
//            call.respond(
//                message = "500: $cause",
//                status = HttpStatusCode.OK
//            )
//        }
    }
}