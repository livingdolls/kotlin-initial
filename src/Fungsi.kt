fun helloWorld() {
    println("Hello World")
}

fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

fun namaYurina( age: Int, nama: String? = "Nanang" ) {
    if (nama != null) {
        println("Nama $nama")
        println("Age $age")
    } else {
        println("Nanang $age")
    }
}

// named argument
fun fullName(
    firstName: String,
    middelName: String,
    lastName: String
) {
    println("$firstName $middelName $lastName")
}

fun printHello(nama: String?): Unit {
    if (nama != null) {
        println("$nama")
    } else {
        println("Nanang")
    }
}

fun printAge(age: Int): Int {
    return age + 10;
}

fun double(a: Int): Int = a * 2;

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0

    for (value in values) {
        println("nilai $total + $value")
        total += value
    }

    println("$name, $total")
}

fun main() {
    helloWorld()
    sayHello("John", "Doe")
    namaYurina(36)
    fullName(
        middelName = "Yurina",
        lastName = "Nanang",
        firstName = "Hirate"
    )

    printHello("www")
    val age = printAge(30)

    println("new age $age")

    println(double(age))

    finalValue("toal", 1,2,3,4,5,6)
}