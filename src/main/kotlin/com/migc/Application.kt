package com.migc

import io.ktor.server.application.*
import com.migc.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()             // this should be first line to avoid compile errors
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configureDefaultHeader()
}
