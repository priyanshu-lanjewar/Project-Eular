//The sum of the even-valued terms is 4613732
fun main() {
    var temp1 = 0
    var temp2 = 1
    var totalSum = 0
    var evenSum = 0

    while (totalSum <= 4000000) {
        totalSum = temp1 + temp2
        temp1 = temp2
        temp2 = totalSum
        if (totalSum % 2 == 0) {
            evenSum += totalSum
        }
    }

    println("The sum of the even-valued terms is $evenSum")
}