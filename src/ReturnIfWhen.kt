fun sayHello(name: String = ""): String {
    return if (name == "") {
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

fun sayYurina(name: String = ""): String {
    return when(name){
        "" -> "Hello Yurina"
        else -> "Hello $name"
    }
}

fun main() {
    println(sayHello())
    println(sayHello("Yurina"))

    println(sayYurina())
    println(sayYurina("Hirate"))
}