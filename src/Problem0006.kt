//The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is 25164150
fun sumOfSquare(no: Int): Int {
    if (no == 0)
        return 0
    else
        return (no * no) + sumOfSquare(no - 1)
}

fun squareOfSum(no: Int): Int {
    return (no * (no + 1) / 2) * (no * (no + 1) / 2)
}

fun main() {
    println(
        "The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " +
                "${squareOfSum(100) - sumOfSquare(100)}"
    )
}
