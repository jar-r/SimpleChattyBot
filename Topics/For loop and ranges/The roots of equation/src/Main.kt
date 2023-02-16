@Suppress("MagicNumber")
fun main() {
    val (a: Int, b: Int, c: Int, d: Int) = IntArray(4) { readln().toInt() }
    for (x in 0..1000) {
        val result = a * x * x * x + b * x * x + c * x + d
        if (result == 0) {
            println(x)
        }
    }
}
