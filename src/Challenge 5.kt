package com.imgineme.aoc18

val LINE_MATCH_REGEX = "(#[0-9]+) @ ([0-9]+),([0-9]+): ([0-9]+)x([0-9]+)".toRegex()

fun main() {
    val linesList = getChallengeInput(3)
    val grid = mutableMapOf<Int, MutableMap<Int, String>>()
    var squares = 0

    linesList.forEach {
        val matchGroups = LINE_MATCH_REGEX.matchEntire(it)!!.groups
        val id = matchGroups.get(1)!!.value
        val x = matchGroups.get(2)!!.value.toInt()
        val y = matchGroups.get(3)!!.value.toInt()
        val width = matchGroups.get(4)!!.value.toInt()
        val height = matchGroups.get(5)!!.value.toInt()

        for(w in 0 until width) {
            val dx = x.plus(w)
            if(!grid.containsKey(dx)) {
                grid[dx] = mutableMapOf<Int, String>()
            }
            val row = grid[dx]!!


            for(h in 0 until height) {
                val dy = y.plus(h)

                if(!row.containsKey(dy)) {
                    row[dy] = id
                } else if(row[dy] != "XXX") {
                    row[dy] = "XXX"
                    squares++
                }
            }
        }
    }

    println(squares)
}