package org.athenian

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ContainsLetterKTests {

    @Test
    fun containsLetterLoopTests() {
        assertThat(containsLetterLoop('a', "")).isFalse()
        assertThat(containsLetterLoop('a', "a")).isTrue()
        assertThat(containsLetterLoop('a', "bb")).isFalse()
        assertThat(containsLetterLoop('a', "abbc")).isTrue()
        assertThat(containsLetterLoop('a', "abbca")).isTrue()
    }

    @Test
    fun containsLetterRecursiveTests() {
        assertThat(containsLetterRecursion('a', "")).isFalse()
        assertThat(containsLetterRecursion('a', "a")).isTrue()
        assertThat(containsLetterRecursion('a', "bb")).isFalse()
        assertThat(containsLetterRecursion('a', "abbc")).isTrue()
        assertThat(containsLetterRecursion('a', "abbca")).isTrue()
    }

    @Test
    fun containsLetterStreamTests() {
        assertThat(containsLetterStream('a', "")).isFalse()
        assertThat(containsLetterStream('a', "a")).isTrue()
        assertThat(containsLetterStream('a', "bb")).isFalse()
        assertThat(containsLetterStream('a', "abbc")).isTrue()
        assertThat(containsLetterStream('a', "abbca")).isTrue()
    }
}
