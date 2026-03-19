fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")

        if (value > 0 ) {
            display(value - 1)
        }
    }

    display(10)

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        // flow
        // value = 10, total = 1
        // rekursif 1
        // value = 10 - 1, 1 * 10 = 10
        // rekursif 2
        // value = 9 -1, 10 * 9 = 90
        // rekursif 3
        // value = 8 - 1, 90 * 8
        //dst
        return when(value) {
            1 -> total // jika sudah mencapai 1, print total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(10))
}