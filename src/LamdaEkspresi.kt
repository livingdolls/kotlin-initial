import java.util.Locale
import java.util.Locale.getDefault

fun toUpper(value: String): String = value.uppercase(getDefault())

fun main() {
    val lamdaName: (String, String) -> String = { value: String, lastName: String ->
        val result = "$value $lastName"
        result
    }

    val result = lamdaName("nanang", "setiawan")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Nanang"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("hello nanang"))
}