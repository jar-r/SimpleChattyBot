fun main() {
    val (a: Int, b: Int) = IntArray(2) { readln().toInt() }
    var result = 1L
    for (i in a until b) {
        result *= i
    }
    print(result)
}

