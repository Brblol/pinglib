package com.example.pinglib

data class PingOptions(
    var timeoutMillis: Int = 1000, var timeToLive: Int = 128
)