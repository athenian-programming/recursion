package org.athenian;

import java.util.stream.IntStream;

public class PairsCount {

    public static int pairsCountLoop(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++)
            if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2)))
                cnt++;
        return cnt;
    }

    public static int pairsCountRecursion(String s) {
        if (s.length() <= 1)
            return 0;

        String firstLetter = s.substring(0, 1);
        String secondLetter = s.substring(1, 2);
        String remainingLetters = s.substring(1);

        if (firstLetter.equals(secondLetter))
            return 1 + pairsCountRecursion(remainingLetters);
        else
            return pairsCountRecursion(remainingLetters);
    }

    public static int pairsCountStream(String s) {
        return (int) IntStream
                .range(0, s.length() - 1)
                .filter(i -> s.substring(i, i + 1).equals(s.substring(i + 1, i + 2)))
                .mapToLong(value -> 1)
                .sum();
    }
}
