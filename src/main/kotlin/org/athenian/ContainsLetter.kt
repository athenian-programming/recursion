package org.athenian

fun containsLetterLoop(c: Char, s: String) =
    when {
        s.isEmpty() -> false
        else -> {
            (0..s.length - 1).forEach {
                if (s[it] == c)
                    return true
            }
            false
        }
    }

fun containsLetterRecursion(c: Char, s: String): Boolean =
    when {
        s.isEmpty() -> false
        s[0] == c -> true
        else -> containsLetterRecursion(c, s.substring(1))
    }

fun containsLetterStream(c: Char, s: String) = s.any { value -> value == c }
