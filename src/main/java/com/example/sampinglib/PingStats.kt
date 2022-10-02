package com.example.sampinglib

import java.net.InetAddress

class PingStats(
    private val address: InetAddress,
    private val noPings: Long,
    val packetsLost: Long,
    totalTimeTaken: Float,
    minTimeTaken: Float,
    maxTimeTaken: Float
) {
    val averageTimeTaken: Float
    private val minTimeTaken: Float
    private val maxTimeTaken: Float
    private val isReachable: Boolean

    init {
        averageTimeTaken = totalTimeTaken / noPings
        this.minTimeTaken = minTimeTaken
        this.maxTimeTaken = maxTimeTaken
        isReachable = noPings - packetsLost > 0
    }

    val averageTimeTakenMillis: Long
        get() = (averageTimeTaken * 1000).toLong()
    val minTimeTakenMillis: Long
        get() = (minTimeTaken * 1000).toLong()
    val maxTimeTakenMillis: Long
        get() = (maxTimeTaken * 1000).toLong()

    override fun toString(): String {
        return "PingStats{" +
                "ia=" + address +
                ", noPings=" + noPings +
                ", packetsLost=" + packetsLost +
                ", averageTimeTaken=" + averageTimeTaken +
                ", minTimeTaken=" + minTimeTaken +
                ", maxTimeTaken=" + maxTimeTaken +
                '}'
    }
}