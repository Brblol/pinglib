package com.example.pinglib

import com.example.pinglib.IPTools
import com.example.pinglib.PingResult
import com.example.pinglib.PingStats
import com.example.pinglib.PingOptions
import com.example.pinglib.PingTools
import com.example.pinglib.Ping.PingListener
import com.example.pinglib.PingNative
import java.net.InetAddress

class PingResult(val address: InetAddress?) {
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