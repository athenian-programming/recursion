package org.athenian;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.athenian.CountLetter.*;

public class CountLetterJTests {

    @Test
    public void letterCountLoopTests() {
        assertThat(countLetterLoop('a', "")).isEqualTo(0);
        assertThat(countLetterLoop('a', "a")).isEqualTo(1);
        assertThat(countLetterLoop('a', "bb")).isEqualTo(0);
        assertThat(countLetterLoop('a', "abbc")).isEqualTo(1);
        assertThat(countLetterLoop('a', "abbca")).isEqualTo(2);
    }

    @Test
    public void letterCountRecursiveTests() {
        assertThat(countLetterRecursion('a', "")).isEqualTo(0);
        assertThat(countLetterRecursion('a', "a")).isEqualTo(1);
        assertThat(countLetterRecursion('a', "bb")).isEqualTo(0);
        assertThat(countLetterRecursion('a', "abbc")).isEqualTo(1);
        assertThat(countLetterRecursion('a', "abbca")).isEqualTo(2);
    }

    @Test
    public void letterCountStreamTests() {
        assertThat(countLetterStream('a', "")).isEqualTo(0);
        assertThat(countLetterStream('a', "a")).isEqualTo(1);
        assertThat(countLetterStream('a', "bb")).isEqualTo(0);
        assertThat(countLetterStream('a', "abbc")).isEqualTo(1);
        assertThat(countLetterStream('a', "abbca")).isEqualTo(2);
    }
}
