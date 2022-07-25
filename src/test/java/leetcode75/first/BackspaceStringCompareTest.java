package leetcode75.first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BackspaceStringCompareTest {
    private final BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    void backspaceCompare() {
        boolean actual = backspaceStringCompare.backspaceCompare("ab#c", "ad#c");
        assertTrue(actual);
    }
}