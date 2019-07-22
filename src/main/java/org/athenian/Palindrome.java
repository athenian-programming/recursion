package org.athenian;

import java.util.stream.IntStream;

public class Palindrome {

    public static boolean isPalindromeLoop(String s) {
        int len = s.length();
        for (int i = 0; i < s.length() / 2; i++) {
            String beginLetter = s.substring(i, i + 1);
            String endLetter = s.substring(len - i - 1, len - i);
            if (!beginLetter.equals(endLetter))
                return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursion(String s) {
        if (s.length() <= 1)
            return true;

        String firstLetter = s.substring(0, 1);
        String lastLetter = s.substring(s.length() - 1);
        if (!firstLetter.equals(lastLetter))
            return false;

        String middleLetters = s.substring(1, s.length() - 1);
        return isPalindromeRecursion(middleLetters);
    }

    public static boolean isPalindromeStream(String s) {
        char[] str = s.toCharArray();
        int len = str.length;

        return IntStream
                .range(0, len / 2)
                .allMatch(i -> str[i] == (str[len - i - 1]));
    }

}