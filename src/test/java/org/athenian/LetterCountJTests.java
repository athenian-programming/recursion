package org.athenian;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.athenian.LetterCount.*;

public class LetterCountJTests {

    @Test
    public void letterCountLoopTests() {
        assertThat(letterCountLoop('a', "")).isEqualTo(0);
        assertThat(letterCountLoop('a', "a")).isEqualTo(1);
        assertThat(letterCountLoop('a', "bb")).isEqualTo(0);
        assertThat(letterCountLoop('a', "abbc")).isEqualTo(1);
        assertThat(letterCountLoop('a', "abbca")).isEqualTo(2);
    }

    @Test
    public void letterCountRecursiveTests() {
        assertThat(letterCountRecursion('a', "")).isEqualTo(0);
        assertThat(letterCountRecursion('a', "a")).isEqualTo(1);
        assertThat(letterCountRecursion('a', "bb")).isEqualTo(0);
        assertThat(letterCountRecursion('a', "abbc")).isEqualTo(1);
        assertThat(letterCountRecursion('a', "abbca")).isEqualTo(2);
    }

    @Test
    public void letterCountStreamTests() {
        assertThat(letterCountStream('a', "")).isEqualTo(0);
        assertThat(letterCountStream('a', "a")).isEqualTo(1);
        assertThat(letterCountStream('a', "bb")).isEqualTo(0);
        assertThat(letterCountStream('a', "abbc")).isEqualTo(1);
        assertThat(letterCountStream('a', "abbca")).isEqualTo(2);
    }
}
