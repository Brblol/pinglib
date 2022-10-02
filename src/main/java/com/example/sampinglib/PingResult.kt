package com.example.sampinglib

import java.net.InetAddress

class PingResult(private val address: InetAddress?) {
    var isReachable = false
    var error: String? = null
    var timeTaken = 0f
    var fullString: String? = null
    var result: String? = null
    fun hasError(): Boolean {
        return error != null
    }

    override fun toString(): String {
        return "PingResult{" +
                "ia=" + address +
                ", isReachable=" + isReachable +
                ", error='" + error + '\'' +
                ", timeTaken=" + timeTaken +
                ", fullString='" + fullString + '\'' +
                ", result='" + result + '\'' +
                '}'
    }
}