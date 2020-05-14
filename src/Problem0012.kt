//The value of the first triangle number to have over five hundred divisors 76576500
import kotlin.math.sqrt

fun main() {

    val s1 = mutableSetOf<Int>()
    val s2 = mutableSetOf<Int>()
    var value = 1
    var no = 0
    while (true) {
        no += value
        for (i in 1..sqrt(no.toDouble()).toInt()) {
            if (no % i == 0)
                s1.add((no / i))
        }
        for (element in s1) {
            if (no % element == 0) {
                s2.add((no / element))
            }
        }
        s1.addAll(s2)
        if (s1.size > 500)
            break

        s1.clear()
        s2.clear()
        value++

    }
    println("The value of the first triangle number to have over five hundred divisors $no")

}