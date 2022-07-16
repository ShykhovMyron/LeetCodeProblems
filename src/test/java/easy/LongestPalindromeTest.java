package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @ParameterizedTest
    @CsvSource({
            "'abccccdd',7",
            "'a',1",
            "'aA',0",
    })
    void longestPalindromeTest(String s, int expected) {
        int actual = longestPalindrome.longestPalindrome(s);
        assertEquals(expected, actual);
    }
}