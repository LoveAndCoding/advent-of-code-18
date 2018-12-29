package com.imgineme.aoc18

fun main() {
    val lineList = getChallengeInput(2)
    var twos = 0
    var threes = 0

    lineList.forEach {
        val charCounts = mutableMapOf<Char, Int>()
        it.forEach {
            charCounts[it] = charCounts.getOrDefault(it, 0) + 1
        }

        if (charCounts.any { it.value == 2 }) twos++
        if (charCounts.any { it.value == 3 }) threes++
    }

    println(twos * threes)
}