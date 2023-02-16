fun main() {
    val (a, b) = IntArray(2) { readln().toInt() }
    println((a + b) * (b - a + 1) / 2)
}
