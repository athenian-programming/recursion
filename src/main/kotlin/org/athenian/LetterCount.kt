package org.athenian


fun letterCountLoop(c: Char, s: String): Int {
    var cnt = 0

    for (aChar in s)
        if (aChar == c)
            cnt++

    return cnt
}

fun letterCountRecursion(c: Char, s: String): Int {
    if (s.length == 0)
        return 0

    val firstLetter = s.slice(0..0)
    val remainingLetters = s.slice(1..s.length - 1)

    return (if (firstLetter == Character.toString(c)) 1 else 0) + letterCountRecursion(c, remainingLetters)
}

fun letterCountStream(c: Char, s: String) =
    s.chars()
        .filter { it == c.toInt() }
        .map { 1 }
        .sum()