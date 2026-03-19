fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Nanang"

    println(name.hello())
    name.printHello()
    "Yurina Hirate".printHello()
}