package org.athenian;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaTests {

    @Test
    public void palindromeTests() {
        assertThat(Palindrome.isPalindrome("")).isTrue();
        assertThat(Palindrome.isPalindrome("a")).isTrue();
        assertThat(Palindrome.isPalindrome("bb")).isTrue();
        assertThat(Palindrome.isPalindrome("bc")).isFalse();
        assertThat(Palindrome.isPalindrome("cdc")).isTrue();
        assertThat(Palindrome.isPalindrome("cde")).isFalse();
        assertThat(Palindrome.isPalindrome("abcdcba")).isTrue();
        assertThat(Palindrome.isPalindrome("abcdebs")).isFalse();
    }
}
