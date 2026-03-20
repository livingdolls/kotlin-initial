import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        val nameTransform = transformer(value)
        return "Hello $nameTransform"
    }

    var lamdaUpper = {value: String -> value.uppercase(getDefault()) }
    println(hello("nanang", lamdaUpper))

    println(hello("YURINA", {value: String -> value.lowercase(getDefault()) }))

    val result = hello("Nanang setiawaN") {
        value: String -> value.lowercase()
    }

    println(result)
}