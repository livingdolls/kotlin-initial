fun main() {
    val range = 1..100

    println(range.count())
    println(range.contains(50))
    println(range.first)
    println(range.last)
    println(range.step)

    val downRange = 100 downTo 1
    println(downRange.count())
    println(downRange.first)
    println(downRange.last)
    println(downRange.step)
    println(downRange.contains(50))

    val stepRange = 0..1000 step 5
    println(stepRange.count())
    println(stepRange.first)
    println(stepRange.last)
    println(downRange.contains(50))
}