import java.util.Locale
import java.util.Locale.getDefault

infix fun String.to(type: String): String {
    if(type == "UP") {
        return uppercase(getDefault())
    } else {
        return lowercase(getDefault())
    }
}

fun main() {
    val result = "Nanang Setiawan" to "UP"
    println(result)

    val yur = "YURINA" to "DOWN"
    println(yur)
}