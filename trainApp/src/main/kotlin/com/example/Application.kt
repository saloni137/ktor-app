package com.example

import com.example.controllers.TrainController
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*

fun main(){
    val trainController = TrainController();
    embeddedServer(Netty,port = 8000){
        routing {
            post("/create") {
                trainController.create(this.context)
            }
            get("/list") {
                trainController.list(this.context)
            }
        }
    }.start(wait = true)
}