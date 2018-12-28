import java.io.File

val inputFile = "c1-input.txt"

fun main() {
    var freq = 0
    val lineList = File(inputFile).readLines()

    lineList.forEach {
        freq += it.toInt()
    }

    println(freq)
}