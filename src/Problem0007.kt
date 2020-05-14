//The 10001st prime number is 104743
import kotlin.math.sqrt

fun main() {
    var no = 1;//as 2 is prime
    var number = 3
    var prime = 2
    while (no != 10001) {
        var isPrime = true
        for (i in sqrt((number).toDouble()).toInt() downTo 2) {
            if (number % i == 0) {
                isPrime = false
            }
        }

        if (isPrime) {
            prime = number
            no++
        }

        number++
    }
    println("The 10001st prime number is $prime")
}