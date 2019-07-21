package org.athenian

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PairsCountKTests {

    @Test
    fun pairsCountLoopTests() {
        assertThat(pairsCountLoop("")).isEqualTo(0)
        assertThat(pairsCountLoop("a")).isEqualTo(0)
        assertThat(pairsCountLoop("bb")).isEqualTo(1)
        assertThat(pairsCountLoop("abbc")).isEqualTo(1)
        assertThat(pairsCountLoop("abbca")).isEqualTo(1)
        assertThat(pairsCountLoop("aabb")).isEqualTo(2)
        assertThat(pairsCountLoop("caabbc")).isEqualTo(2)
        assertThat(pairsCountLoop("aabbccdede")).isEqualTo(3)
        assertThat(pairsCountLoop("aabbccdedee")).isEqualTo(4)
        assertThat(pairsCountLoop("abcdefg")).isEqualTo(0)
    }

    @Test
    fun pairCountRecursiveTests() {
        assertThat(pairsCountRecursion("")).isEqualTo(0)
        assertThat(pairsCountRecursion("a")).isEqualTo(0)
        assertThat(pairsCountRecursion("bb")).isEqualTo(1)
        assertThat(pairsCountRecursion("abbc")).isEqualTo(1)
        assertThat(pairsCountRecursion("abbca")).isEqualTo(1)
        assertThat(pairsCountRecursion("aabb")).isEqualTo(2)
        assertThat(pairsCountRecursion("caabbc")).isEqualTo(2)
        assertThat(pairsCountRecursion("aabbccdede")).isEqualTo(3)
        assertThat(pairsCountRecursion("aabbccdedee")).isEqualTo(4)
        assertThat(pairsCountRecursion("abcdefg")).isEqualTo(0)
    }

    @Test
    fun pairCountStreamTests() {
        assertThat(pairsCountStream("")).isEqualTo(0)
        assertThat(pairsCountStream("a")).isEqualTo(0)
        assertThat(pairsCountStream("bb")).isEqualTo(1)
        assertThat(pairsCountStream("abbc")).isEqualTo(1)
        assertThat(pairsCountStream("abbca")).isEqualTo(1)
        assertThat(pairsCountStream("aabb")).isEqualTo(2)
        assertThat(pairsCountStream("caabbc")).isEqualTo(2)
        assertThat(pairsCountStream("aabbccdede")).isEqualTo(3)
        assertThat(pairsCountStream("aabbccdedee")).isEqualTo(4)
        assertThat(pairsCountStream("abcdefg")).isEqualTo(0)
    }
}