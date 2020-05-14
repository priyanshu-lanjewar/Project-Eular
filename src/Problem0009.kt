//Product abc = 31875000
fun main() {
    for (a in 3..(997) / 3)
        for (b in a + 1..(999 - a) / 2) {
            val c = 1000 - a - b
            if (c * c == a * a + b * b)
                println("Product abc = ${a * b * c}")
        }
}
