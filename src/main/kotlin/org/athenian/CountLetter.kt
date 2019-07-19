package org.athenian


fun countLetterLoop(c: Char, s: String): Int {
    var cnt = 0
    s.forEach { if (it == c) cnt++ }
    return cnt
}

fun countLetterRecursion(c: Char, s: String): Int =
    when {
        s.isEmpty() -> 0
        else -> (if (s[0] == c) 1 else 0) + countLetterRecursion(c, s.substring(1))
    }

fun countLetterStream(c: Char, s: String) =
    s.chars()
        .filter { it == c.toInt() }
        .map { 1 }
        .sum()