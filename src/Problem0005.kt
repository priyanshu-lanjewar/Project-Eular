//The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is 232792560
import kotlin.system.exitProcess

fun main() {
    var number = 20;

    while (true) {
        var isAns = false
        for (i in 20 downTo 1) {
            if (number % i == 0) {
                isAns = true
            } else {
                isAns = false
                number++
                break
            }
        }
        if (isAns) {
            println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is $number")
            exitProcess(0)
        }
    }
}