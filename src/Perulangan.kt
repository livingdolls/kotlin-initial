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


    var i = 0

    while(true) {
        println("Break me")
        i++

        if(i > 10) break
    }

    while(true) {
        i++

        if(i == 10) {
            println("berhenti")
            break;
        } else if(i % 2 == 0) {
            println("I'm afra $i")
            continue;
        } else {
            println("Jalan")
        }
    }
}