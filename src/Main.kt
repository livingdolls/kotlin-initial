fun main() {
//    aarray
    val members: Array<String> = arrayOf("Yurina", "Hirate", "Setiawan")

    val nanang: String = members.get(0)
    val hirate: String = members.get(2)
    val setiawan: String = members.get(1)
    println(nanang)
    println(hirate)
    println(setiawan)

    // ubah array
    members.set(1, "and")

    println(members.get(1))

    // null array
    val membersdua : Array<String?> = arrayOfNulls(10)
    membersdua[1] = "Yurina Hirate"
    print(membersdua[1])
}