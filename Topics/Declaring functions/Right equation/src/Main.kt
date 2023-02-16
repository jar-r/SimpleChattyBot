// write your code here
fun isRightEquation(a: Int, b: Int, c: Int): Boolean = a * b == c

/* Do not change code below */
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(isRightEquation(a, b, c))
}
