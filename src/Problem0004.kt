//The largest palindrome made from the product of two 3-digit numbers is 906609
fun isPallindrome(no: Int): Boolean {
    var Num = no.toString()
    for (i in 0 until (Num.length) / 2) {
        if (Num[i] != Num[Num.length - 1 - i]) {
            return false
        }

    }
    return true
}

fun main() {

    var large: Int = 0
    for (i in 999 downTo 100) {
        for (j in 999 downTo 100) {
            if (isPallindrome(i * j)) {
                large = large.coerceAtLeast((i * j))
            }
        }
    }
    println("The largest palindrome made from the product of two 3-digit numbers is $large")

}