inline fun hello(name: () ->  String): String {
    return "Hello ${name()}"
}

inline fun sayHello(
    firstName: () -> String,
   noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello{ "Nanang" })
    println(hello{ "Setiawan" })

    for (i in 0..10) {
        println(hello{ "hello $i" })
    }

    for (i in 0..10) {
        println(sayHello({" Yurina "}, {" Hirate "}))
    }
}