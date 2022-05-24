package com.example.controllers

import com.example.models.Train
import com.example.services.TrainService
import com.example.utils.Response
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*

class TrainController() {
    private val trainService: TrainService = TrainService()
    suspend fun create(ctx:ApplicationCall){
        val train = ctx.receiveOrNull<Train>()?:return
        val result = trainService.create(train)
        ctx.respond(Response(
            code = "200",
            message = "Train insert successfully",
            data =result
        ))
    }

    suspend fun list(ctx: ApplicationCall) {
        val result = trainService.list()
        ctx.respond(Response(
            code = "200",
            message = "success.",
            data =result
        ))
    }
}