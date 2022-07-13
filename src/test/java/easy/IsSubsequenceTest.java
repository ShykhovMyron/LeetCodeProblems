package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsSubsequenceTest {
    private final IsSubsequence isSubsequence = new IsSubsequence();

    @ParameterizedTest
    @CsvSource({
            "'abc','ahbgdc',true",
            "'axc','ahbgdc',false",
    })
    void isSubsequenceTest(String s, String t, boolean expected) {
        boolean actual = isSubsequence.isSubsequence(s, t);
        assertEquals(expected, actual);
    }
}