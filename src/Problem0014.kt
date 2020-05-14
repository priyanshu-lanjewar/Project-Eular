//Starting number, under one million, produces the longest chain is 837799
fun main() {
    val li = mutableListOf<Long>()
    var st = 0L
    var ll = 0L
    for (i in 1L..1000000L) {
        li.clear()
        var no = i
        li.add(no)
        while (no != 1L) {
            if (no % 2 == 0L) {
                no /= 2
                li.add(no)
            } else {
                no = 3 * no + 1
                li.add(no)
            }
        }
        if (ll < li.size) {
            st = i
            ll = li.size.toLong()
        }

    }

    println("Starting number, under one million, produces the longest chain is $st")
}