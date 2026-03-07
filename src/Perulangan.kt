fun main() {
    val names = arrayOf("Nanang", "Yurina", "Hirate")

    var total = 0
    for (name in names) {
        println(name)
        total++
    }

    println("Total data = $total")

    for (value in 0..10 step 2) {
        println(value)
    }

    for (i in 100 downTo 0 step 2) {
        println(i)
    }

    for(i in 0..names.size - 1) {
        println(i)
    }

    var ok = 0

    while(ok < 10) {
        println("Loop")
        ok++
    }
}