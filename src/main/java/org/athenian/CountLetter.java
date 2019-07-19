package org.athenian;

public class CountLetter {

    public static int countLetterLoop(char c, String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.substring(i, i + 1).equals(Character.toString(c)))
                cnt++;
        return cnt;
    }

    public static int countLetterRecursion(char c, String s) {
        if (s.isEmpty())
            return 0;

        String firstLetter = s.substring(0, 1);
        String remainingLetters = s.substring(1);

        if (firstLetter.equals(Character.toString(c)))
            return 1 + countLetterRecursion(c, remainingLetters);
        else
            return countLetterRecursion(c, remainingLetters);
    }

    public static int countLetterStream(char c, String s) {
        return (int) s.chars()
                .filter(value -> value == c)
                .mapToLong(value -> 1)
                .sum();
    }
}
