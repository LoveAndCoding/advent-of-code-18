package com.imgineme.aoc18

fun main() {
    var freq = 0
    val lineList = getChallengeInput(1)

    lineList.forEach {
        freq += it.toInt()
    }

    println(freq)
}