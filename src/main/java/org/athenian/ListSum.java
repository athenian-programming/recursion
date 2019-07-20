package org.athenian;

import java.util.List;

public class ListSum {

    public static int listSumLoop(List<Integer> list) {
        int sum = 0;
        for (Integer i : list)
            sum += i;
        return sum;
    }

    public static int listSumRecursion(List<Integer> list) {
        if (list.isEmpty())
            return 0;

        return list.get(0) + listSumRecursion(list.subList(1, list.size()));
    }

    public static int listSumStream(List<Integer> list) {
        return list
                .stream()
                .mapToInt(i -> i)
                .sum();
    }
}
