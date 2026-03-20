fun main() {
    var counter: Int = 0

    val lamdaIncrement: () -> Unit = {
        println("Lamda Increment $counter")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment $counter")
        counter++
    }

    fun functionIncrement() {
        println("Function increment $counter")
        counter++
    }

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    lamdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}