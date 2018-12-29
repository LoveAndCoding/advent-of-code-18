package com.imgineme.aoc18

import java.io.File

fun getChallengeInput(day: Int) =
        File("d${day}-input.txt").readLines()