package com.imgineme.aoc18

fun main() {
    val lineList = getChallengeInput(2)
    val possibilities = mutableSetOf<String>()

    lineList.forEach {
        for (c in 0 until it.length - 1) {
            val possible = it.replaceRange(c, c + 1, " ")

            if(possibilities.contains(possible)) {
                println(possible.replace(" ", ""))
                return
            }
            possibilities.add(possible)
        }
    }
}