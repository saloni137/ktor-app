package com.example.utils

data class Response (
        val code: String,
        val message: String,
        val data : Any? = null
        )