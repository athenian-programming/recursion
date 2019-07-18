package org.athenian;

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

    public static String reverse(String s) {
        final int len = s.length();
        final StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i >= 0; i--)
            sb.append(s.charAt(i));
        return sb.toString();
    }

    public static boolean isPalindromeStream(String s) {
        String[] firstHalf = s.substring(0, s.length() / 2).split("");
        String[] secondHalf = reverse(s.substring(s.length() - (s.length() / 2))).split("");

        //List<String> list = Stream.of(firstHalf)
        //        .collect(Collectors.toMap(o -> {}));

        return true;
    }

    public static boolean isPalindromeRecursion(String s) {
        if (s.length() <= 1)
            return true;

        String firstLetter = s.substring(0, 1);
        String lastLetter = s.substring(s.length() - 1);
        String middleLetters = s.substring(1, s.length() - 1);

        return firstLetter.equals(lastLetter) && isPalindromeRecursion(middleLetters);
    }
}
