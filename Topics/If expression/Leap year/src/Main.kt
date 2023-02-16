fun main() {
    // write your code here

    fun leapYear(year: Int): Boolean {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
    }

    val year = readln().toInt()
    if (leapYear(year)) {
        println("Leap")
    } else {
        println("Regular")
    }
}
