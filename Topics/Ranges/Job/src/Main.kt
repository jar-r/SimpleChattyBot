fun main() {
    // write your code here
    val age = readln().toInt()
    val workingAgeRange = 18..59
    println(age in workingAgeRange)
}
// even with "workingAgeRange" I got the magic number. @Ahmed Fotoh sollution is much cleaner.
