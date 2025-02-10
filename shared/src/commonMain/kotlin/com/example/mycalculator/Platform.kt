package com.example.mycalculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform