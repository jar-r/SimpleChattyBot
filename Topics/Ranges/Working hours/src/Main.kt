@Suppress("MagicNumber")
fun main() {
    val time = readln().toInt()
    val workTime = 9..18
    val lunchTime = 13..14
    // do not change the code above
    // put your code here
    val withinTime = time in workTime
    val notWithinTime = time !in lunchTime
    println(withinTime && notWithinTime)
}
