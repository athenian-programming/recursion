package org.athenian;

public class ContainsLetter {

    public static boolean containsLetterLoop(char c, String s) {
        String cstr = Character.toString(c);

        for (int i = 0; i < s.length(); i++)
            if (s.substring(i, i + 1).equals(cstr))
                return true;

        return false;
    }

    public static boolean containsLetterRecursion(char c, String s) {
        if (s.length() == 0)
            return false;

        String firstLetter = s.substring(0, 1);
        if (firstLetter.equals(Character.toString(c)))
            return true;

        return containsLetterRecursion(c, s.substring(1));
    }

    public static boolean containsLetterStream(char c, String s) {
        return s.chars()
                .filter(value -> value == c)
                .findAny()
                .isPresent();
    }
}
