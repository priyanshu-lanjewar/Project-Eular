// The sum of the digits of the number 2 power 1000 is 1366
fun main() {
    val number = 2.toBigInteger()
    var value = number.pow(1000).toString()
    var sum = 0
    while (value != "")
    {
        sum+=Integer.parseInt(value[0].toString())
        value=value.removeRange(0..0)
    }
    println("The sum of the digits of the number 2 power 1000 is $sum")
}