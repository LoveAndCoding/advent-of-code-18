package com.imgineme.aoc18

fun main() {
    var freq = 0
    val freqSet = mutableSetOf<Int>()
    val lineList = getChallengeInput(1)
    var line = 0

    do {
        freqSet.add(freq)

        freq += lineList[line++ % lineList.size].toInt()
    } while (!freqSet.contains(freq))

    println(freq)
}