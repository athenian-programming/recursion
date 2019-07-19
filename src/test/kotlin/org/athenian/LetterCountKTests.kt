package org.athenian

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LetterCountKTests {

    @Test
    fun letterCountLoopTests() {
        assertThat(countLetterLoop('a', "")).isEqualTo(0)
        assertThat(countLetterLoop('a', "a")).isEqualTo(1)
        assertThat(countLetterLoop('a', "bb")).isEqualTo(0)
        assertThat(countLetterLoop('a', "abbc")).isEqualTo(1)
        assertThat(countLetterLoop('a', "abbca")).isEqualTo(2)
    }

    @Test
    fun letterCountRecursiveTests() {
        assertThat(countLetterRecursion('a', "")).isEqualTo(0)
        assertThat(countLetterRecursion('a', "a")).isEqualTo(1)
        assertThat(countLetterRecursion('a', "bb")).isEqualTo(0)
        assertThat(countLetterRecursion('a', "abbc")).isEqualTo(1)
        assertThat(countLetterRecursion('a', "abbca")).isEqualTo(2)
    }

    @Test
    fun letterCountStreamTests() {
        assertThat(countLetterStream('a', "")).isEqualTo(0)
        assertThat(countLetterStream('a', "a")).isEqualTo(1)
        assertThat(countLetterStream('a', "bb")).isEqualTo(0)
        assertThat(countLetterStream('a', "abbc")).isEqualTo(1)
        assertThat(countLetterStream('a', "abbca")).isEqualTo(2)
    }
}