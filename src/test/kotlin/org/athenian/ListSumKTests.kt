package org.athenian

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ListSumKTests {

    @Test
    fun listSumLoopTests() {
        assertThat(listSumLoop(listOf())).isEqualTo(0)
        assertThat(listSumLoop(listOf(6))).isEqualTo(6)
        assertThat(listSumLoop(listOf(1, 2, 3))).isEqualTo(6)
        assertThat(listSumLoop(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(21)
    }

    @Test
    fun listSumRecursiveTests() {
        assertThat(listSumRecursion(listOf())).isEqualTo(0)
        assertThat(listSumRecursion(listOf(6))).isEqualTo(6)
        assertThat(listSumRecursion(listOf(1, 2, 3))).isEqualTo(6)
        assertThat(listSumRecursion(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(21)
    }

    @Test
    fun listSumStreamTests() {
        assertThat(listSumStream(listOf())).isEqualTo(0)
        assertThat(listSumStream(listOf(6))).isEqualTo(6)
        assertThat(listSumStream(listOf(1, 2, 3))).isEqualTo(6)
        assertThat(listSumStream(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(21)
    }
}