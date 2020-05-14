/* If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,number of letters would be used is 21124 */
fun main() {
    var sum = "onethousand".length
    for (i in 1..999) {
        sum += toLetter(i).length
    }
    println("If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,number of letters would be used is $sum")
}

fun toLetter(no: Int): String {
    var notostr = no.toString()
    var ans = ""
    if (notostr.length == 3) {
        ans += getHundrethPlaceLetterFor(notostr[0])
        notostr = notostr.removeRange(0..0)
        ans += "hundred"
        if (notostr[0] == '0' && notostr[1] == '0')
            return ans
        ans += "and"
    }

    if (notostr.length == 2) {
        ans += getTensPlaceLetterFor(notostr[0], notostr)
        if (notostr[0] == '1')
            return ans
        notostr = notostr.removeRange(0..0)

    }
    if (notostr.length == 1) {
        ans += getUnitPlaceLetterFor(notostr[0])

    }
    return ans
}

fun getUnitPlaceLetterFor(c: Char): String {
    return when (c) {
        '1' -> "one"
        '2' -> "two"
        '3' -> "three"
        '4' -> "four"
        '5' -> "five"
        '6' -> "six"
        '7' -> "seven"
        '8' -> "eight"
        '9' -> "nine"
        else -> ""
    }
}

fun getTensPlaceLetterFor(c: Char, no: String): String {
    return when (c) {
        '1' -> {
            when (no[1]) {
                '1' -> "eleven"
                '2' -> "twelve"
                '3' -> "thirteen"
                '4' -> "fourteen"
                '5' -> "fifteen"
                '6' -> "sixteen"
                '7' -> "seventeen"
                '8' -> "eighteen"
                '9' -> "nineteen"
                '0' -> "ten"
                else -> ""
            }
        }
        '2' -> "twenty"
        '3' -> "thirty"
        '4' -> "forty"
        '5' -> "fifty"
        '6' -> "sixty"
        '7' -> "seventy"
        '8' -> "eighty"
        '9' -> "ninety"
        else -> ""
    }
}

fun getHundrethPlaceLetterFor(c: Char): String {
    return when (c) {
        '1' -> "one"
        '2' -> "two"
        '3' -> "three"
        '4' -> "four"
        '5' -> "five"
        '6' -> "six"
        '7' -> "seven"
        '8' -> "eight"
        '9' -> "nine"
        else -> ""
    }

}
