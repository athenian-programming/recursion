package org.athenian

fun containsLetterLoop(c: Char, s: String): Boolean {
    val cstr = Character.toString(c)

    for (i in 0 until s.length)
        if (s.substring(i, i + 1) == cstr)
            return true

    return false
}

fun containsLetterRecursion(c: Char, s: String): Boolean =
    if (s.length == 0)
        false
    else
        if (s.substring(0, 1) == Character.toString(c)) true else containsLetterRecursion(c, s.substring(1))

fun containsLetterStream(c: Char, s: String) = s.any { value -> value == c }
