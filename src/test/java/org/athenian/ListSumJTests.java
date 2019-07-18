package org.athenian;

import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListSumJTests {

    @Test
    public void listSumLoopTests() {
        assertThat(ListSum.listSumLoop(Lists.list())).isEqualTo(0);
        assertThat(ListSum.listSumLoop(Lists.list(1, 2, 3))).isEqualTo(6);
        assertThat(ListSum.listSumLoop(Lists.list(1, 2, 3, 4, 5, 6))).isEqualTo(21);
    }

    @Test
    public void listSumRecursiveTests() {
        assertThat(ListSum.listSumRecursion(Lists.list())).isEqualTo(0);
        assertThat(ListSum.listSumRecursion(Lists.list(1, 2, 3))).isEqualTo(6);
        assertThat(ListSum.listSumRecursion(Lists.list(1, 2, 3, 4, 5, 6))).isEqualTo(21);
    }

    @Test
    public void listSumStreamTests() {
        assertThat(ListSum.listSumStream(Lists.list())).isEqualTo(0);
        assertThat(ListSum.listSumStream(Lists.list(1, 2, 3))).isEqualTo(6);
        assertThat(ListSum.listSumStream(Lists.list(1, 2, 3, 4, 5, 6))).isEqualTo(21);
    }
}
