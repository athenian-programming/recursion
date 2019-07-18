package org.athenian;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;

        final String firstLetter = s.substring(0, 1);
        final String lastLetter = s.substring(s.length() - 1);
        final String middleLetters = s.substring(1, s.length() - 1);

        return firstLetter.equals(lastLetter) && isPalindrome(middleLetters);
    }
}
