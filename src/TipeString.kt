fun main() {
    var firstname: String = "Nanang"
    var lastname: String = "Setiawan"

    var semua: String = """
        Nanang 
        Setiawan
        Yurina
        Hirate
    """.trimIndent()

    println(firstname)
    println(lastname)
    println(semua)

    var address: String = """
        | Tokyo
        | Dan
        | Yurina
    """.trimMargin()

    println(address)

    var address2: String = """
        >Nanang
        >dan
        >Yurina
    """.trimMargin(">")

    println(address2)

    var fullname: String = firstname + " " + lastname

    println(fullname)

    var fullname2: String = "$firstname $lastname"
    println(fullname2)
    var desc = "$fullname panjang = ${fullname2.length}"

    println(desc)
}