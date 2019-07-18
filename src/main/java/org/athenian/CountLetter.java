package org.athenian;

public class CountLetter {

    public static int countLetter(char c, String s) {
        if (s.length() == 0)
            return 0;

        final String firstLetter = s.substring(0, 1);
        final String remainingLetters = s.substring(1);

        if (firstLetter.equals("" + c))
            return 1 + countLetter(c, remainingLetters);
        else
            return countLetter(c, remainingLetters);
    }

    public static void main(String[] args) {
        System.out.println(countLetter('a', ""));
        System.out.println(countLetter('a', "a"));
        System.out.println(countLetter('a', "bb"));
        System.out.println(countLetter('a', "abbc"));
        System.out.println(countLetter('a', "abbca"));
    }
}
