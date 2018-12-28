import java.io.File

val c2InputFile = "c1-input.txt"

fun main() {
    var freq = 0
    val freqSet = mutableSetOf<Int>()
    val lineList = File(c2InputFile).readLines()
    var line = 0

    do {
        freqSet.add(freq)

        freq += lineList[line++ % lineList.size].toInt()
    } while (!freqSet.contains(freq))

    println(freq)
}