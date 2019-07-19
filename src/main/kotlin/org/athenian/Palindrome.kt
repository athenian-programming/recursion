package org.athenian

fun isPalindromeLoop(s: String) =
    when {
        s.isEmpty() -> true
        else -> {
            val len = s.length
            (0..len / 2).forEach {
                val beginLetter = s[it]
                val endLetter = s[len - it - 1]
                if (beginLetter != endLetter)
                    return false
            }
            true
        }
    }

fun isPalindromeRecursion(s: String): Boolean =
    when {
        s.length <= 1 -> true
        else -> (s[0] == s[s.length - 1]) && isPalindromeRecursion(s.slice(1..s.length - 2))
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