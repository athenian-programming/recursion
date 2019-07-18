package org.athenian;

public class Palindrome {

    public static boolean isPalindromeLoop(String s) {
        final int len = s.length();
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

        final String firstLetter = s.substring(0, 1);
        final String lastLetter = s.substring(s.length() - 1);
        final String middleLetters = s.substring(1, s.length() - 1);

        return firstLetter.equals(lastLetter) && isPalindromeRecursion(middleLetters);
    }
}
