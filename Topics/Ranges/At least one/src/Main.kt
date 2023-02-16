fun main() {
    // write your code here
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()
    val e: Int = readln().toInt()
    val range1 = a..b
    val range2 = c..d
    val rangeTogether = range1 + range2
    println(e in rangeTogether)
}