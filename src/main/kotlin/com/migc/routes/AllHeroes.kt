package com.migc.routes

import com.migc.models.ApiResponse
import com.migc.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

// End Point
fun Route.getALlHeroes() {
    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1   // sets 1 as default if page isn't specified
            require(page in 1..5)

            val apiResponse = heroRepository.getAllHeroes(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: java.lang.NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: java.lang.IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Heroes not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}