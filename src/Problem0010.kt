//The sum of all the primes below two million 142913828922
import kotlin.math.sqrt

fun main() {
    var sum = 0.toBigInteger();

    for (i in 2..2000000) {
        var isPrime = true
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0)
                isPrime = false
        }

        if (isPrime) {
            sum += i.toBigInteger()

        }
    }

    println("The sum of all the primes below two million $sum")
}