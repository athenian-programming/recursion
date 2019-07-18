package org.athenian

fun isPalindromeLoop(s: String): Boolean {
    val len = s.length
    for (i in 0 until s.length / 2) {
        val beginLetter = s.substring(i, i + 1)
        val endLetter = s.substring(len - i - 1, len - i)
        if (beginLetter != endLetter)
            return false
    }
    return true
}

fun isPalindromeStream(s: String): Boolean {
    if (s.length <= 1)
        return true

    val half = s.length / 2
    val firstHalf = s.slice(0..half - 1)
    val secondHalf = s.slice(s.length - half..s.length - 1)

    return !firstHalf
        .zip(secondHalf.reversed())
        .any { (c1, c2) -> c1 != c2 }
}

fun isPalindromeRecursion(s: String): Boolean {
    if (s.length <= 1)
        return true

    val firstLetter = s.slice(0..0)
    val lastLetter = s.slice(s.length - 1..s.length - 1)
    val middleLetters = s.slice(1..s.length - 2)

    return (firstLetter == lastLetter) && isPalindromeRecursion(middleLetters)
}
