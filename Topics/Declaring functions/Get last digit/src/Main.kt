@Suppress("MagicNumber")
fun main() {
    val a = readln().toInt().toLong()
    fun getLastDigit(a: Long): Long {
        return a % 10
    }
    // Check if value is negative and change it to positive
    val positiveA = if (a < 0) -1 * a else a

    println(getLastDigit(positiveA))
}
