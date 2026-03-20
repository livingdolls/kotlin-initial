import java.util.Locale.getDefault

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransformer = transformer(name)
        return "Hello $nameTransformer"
    }

    val anonymousUpper = fun(value: String): String {
        if(value.isBlank()){
            return "Ups"
        }

        return value.uppercase(getDefault())
    }

    println(hello("Nanang ",anonymousUpper))
    println(hello("", anonymousUpper))
}