package org.athenian

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KotlinTests {

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
    fun letterCountLoopTests() {
        assertThat(letterCountLoop('a', "")).isEqualTo(0)
        assertThat(letterCountLoop('a', "a")).isEqualTo(1)
        assertThat(letterCountLoop('a', "bb")).isEqualTo(0)
        assertThat(letterCountLoop('a', "abbc")).isEqualTo(1)
        assertThat(letterCountLoop('a', "abbca")).isEqualTo(2)
    }

    @Test
    fun letterCountStreamTests() {
        assertThat(letterCountStream('a', "")).isEqualTo(0)
        assertThat(letterCountStream('a', "a")).isEqualTo(1)
        assertThat(letterCountStream('a', "bb")).isEqualTo(0)
        assertThat(letterCountStream('a', "abbc")).isEqualTo(1)
        assertThat(letterCountStream('a', "abbca")).isEqualTo(2)
    }

    @Test
    fun letterCountRecursiveTests() {
        assertThat(letterCountRecursion('a', "")).isEqualTo(0)
        assertThat(letterCountRecursion('a', "a")).isEqualTo(1)
        assertThat(letterCountRecursion('a', "bb")).isEqualTo(0)
        assertThat(letterCountRecursion('a', "abbc")).isEqualTo(1)
        assertThat(letterCountRecursion('a', "abbca")).isEqualTo(2)
    }

    @Test
    fun listSumLoopTests() {
        assertThat(listSumLoop(listOf())).isEqualTo(0)
        assertThat(listSumLoop(listOf(1, 2, 3))).isEqualTo(6)
        assertThat(listSumLoop(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(21)
    }

    @Test
    fun listSumStreamTests() {
        assertThat(listSumStream(listOf())).isEqualTo(0)
        assertThat(listSumStream(listOf(1, 2, 3))).isEqualTo(6)
        assertThat(listSumStream(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(21)
    }

    @Test
    fun listSumRecursiveTests() {
        assertThat(listSumRecursion(listOf())).isEqualTo(0)
        assertThat(listSumRecursion(listOf(1, 2, 3))).isEqualTo(6)
        assertThat(listSumRecursion(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(21)
    }

}