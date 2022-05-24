package com.example.models

import io.ktor.server.plugins.*

data class Train(
    val id : String,
    val name: String,
    val source: String,
    val destination: String,
    val departureTime: String
)