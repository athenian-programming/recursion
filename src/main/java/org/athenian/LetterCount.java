package org.athenian;

public class LetterCount {

    public static int letterCountLoop(char c, String s) {
        String cstr = Character.toString(c);
        int cnt = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.substring(i, i + 1).equals(cstr))
                cnt++;

        return cnt;
    }

    public static int letterCountRecursion(char c, String s) {
        if (s.length() == 0)
            return 0;

        String firstLetter = s.substring(0, 1);
        String remainingLetters = s.substring(1);

        if (firstLetter.equals(Character.toString(c)))
            return 1 + letterCountRecursion(c, remainingLetters);
        else
            return letterCountRecursion(c, remainingLetters);
    }

    public static int letterCountStream(char c, String s) {
        return (int) s.chars()
                .filter(value -> value == c)
                .mapToLong(value -> 1)
                .sum();
    }
}
