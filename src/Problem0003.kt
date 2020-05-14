//The largest prime factor of the number 600851475143 is 6857
import kotlin.math.sqrt

fun main() {
    var num = 600851475143
    var ans = 0L

    var counter = 2L
    while (counter <= sqrt(num.toDouble())) {
        if (num % counter == 0L) {
            num /= counter
            ans = counter
        } else {
            counter++
        }
    }
    if (num > ans) {
        ans = num
    }
    println("The largest prime factor of the number 600851475143 is $ans")
}