package org.athenian

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PalindromeKTests {
    
    @Test
    fun palindromeLoopTests() {
        assertThat(isPalindromeLoop("")).isTrue()
        assertThat(isPalindromeLoop("a")).isTrue()
        assertThat(isPalindromeLoop("bb")).isTrue()
        assertThat(isPalindromeLoop("bc")).isFalse()
        assertThat(isPalindromeLoop("cdc")).isTrue()
        assertThat(isPalindromeLoop("cde")).isFalse()
        assertThat(isPalindromeLoop("abcdcba")).isTrue()
        assertThat(isPalindromeLoop("abcdebs")).isFalse()
    }

    @Test
    fun palindromeRecursionTests() {
        assertThat(isPalindromeRecursion("")).isTrue()
        assertThat(isPalindromeRecursion("a")).isTrue()
        assertThat(isPalindromeRecursion("bb")).isTrue()
        assertThat(isPalindromeRecursion("bc")).isFalse()
        assertThat(isPalindromeRecursion("cdc")).isTrue()
        assertThat(isPalindromeRecursion("cde")).isFalse()
        assertThat(isPalindromeRecursion("abcdcba")).isTrue()
        assertThat(isPalindromeRecursion("abcdebs")).isFalse()
    }

    @Test
    fun palindromeStreamTests() {
        assertThat(isPalindromeStream("")).isTrue()
        assertThat(isPalindromeStream("a")).isTrue()
        assertThat(isPalindromeStream("bb")).isTrue()
        assertThat(isPalindromeStream("bc")).isFalse()
        assertThat(isPalindromeStream("cdc")).isTrue()
        assertThat(isPalindromeStream("cde")).isFalse()
        assertThat(isPalindromeStream("abcdcba")).isTrue()
        assertThat(isPalindromeStream("abcdebs")).isFalse()
    }
}