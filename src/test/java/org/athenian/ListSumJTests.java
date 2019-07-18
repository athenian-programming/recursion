package org.athenian;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.athenian.ListSum.*;

public class ListSumJTests {

    @Test
    public void listSumLoopTests() {
        assertThat(listSumLoop(Lists.list())).isEqualTo(0);
        assertThat(listSumLoop(Lists.list(1, 2, 3))).isEqualTo(6);
        assertThat(listSumLoop(Lists.list(1, 2, 3, 4, 5, 6))).isEqualTo(21);
    }

    @Test
    public void listSumRecursiveTests() {
        assertThat(listSumRecursion(Lists.list())).isEqualTo(0);
        assertThat(listSumRecursion(Lists.list(1, 2, 3))).isEqualTo(6);
        assertThat(listSumRecursion(Lists.list(1, 2, 3, 4, 5, 6))).isEqualTo(21);
    }

    @Test
    public void listSumStreamTests() {
        assertThat(listSumStream(Lists.list())).isEqualTo(0);
        assertThat(listSumStream(Lists.list(1, 2, 3))).isEqualTo(6);
        assertThat(listSumStream(Lists.list(1, 2, 3, 4, 5, 6))).isEqualTo(21);
    }
}
