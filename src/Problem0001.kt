// The sum of all the multiples of 3 or 5 below 1000 is 233168
fun main() {
    var sum = 0

    for (i in 1..999) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    println("The sum of all the multiples of 3 or 5 below 1000 is $sum")
}