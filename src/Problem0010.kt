//The sum of all the primes below two million 142913828922
import java.math.BigInteger
import kotlin.math.sqrt

fun main() {
    var sum = 2L

    for (i in 3..2000000 step 2) {
        var isPrime = true

            for (j in 3..sqrt(i.toDouble()).toInt() step 2) {
                if (i % j == 0){
                    isPrime = false
                    break
                }
            }


        if (isPrime) {
            sum += i

        }
    }

    println("The sum of all the primes below two million $sum")
}