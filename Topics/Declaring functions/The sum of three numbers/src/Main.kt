// write your function here

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    fun sum(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    val result = sum(a, b, c)
    println(result)
}