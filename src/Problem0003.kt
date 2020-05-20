//The largest prime factor of the number 600851475143 is 6857
import kotlin.math.sqrt

fun main() {
    var num = 600851475143
    var counter = 2L
    while (counter <= sqrt(num.toDouble())) {
       while (num%counter==0L)
           num/=counter
        counter++
    }
    println("The largest prime factor of the number 600851475143 is $num")
}