fun main() {
    var examValue = 90

    // if expresionn
    if (examValue > 10) {
        println("Good morning")
    } else {
        println("Bad morning")
    }

    // when expression
    var finalExam = "C"

    when (finalExam) {
        "A" -> println("Nice")
        "B" -> println("Nice Boy")
        "C" -> println("Great Nice")
        else -> println("Good morning")
    }

    // when expresion multiple option
    when (finalExam) {
        "A", "B", "C" -> println("Good morning")
        else -> println("Bad morning")
    }

    var passValue = arrayOf("A", "B", "C")

    var nilai = "E"

    when (nilai) {
        in passValue -> println("Good morning")
        !in passValue -> println("Bad morning")
    }

    val name = "Yurina"

    when(name) {
        is String -> println("Good morning")
        !is String -> println("Bad morning")
    }

    val nilaiUjian = 90

    when {
        nilaiUjian > 90 -> println("OK morning")
        nilaiUjian > 80 -> println("Nice morning")
        nilaiUjian > 40 -> println("Yoyo morning")
        else -> println("Bad morning")
    }
}