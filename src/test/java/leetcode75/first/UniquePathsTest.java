package leetcode75.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {
    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    void uniquePaths() {
        int actual = uniquePaths.uniquePaths(23, 12);
        assertEquals(193536720, actual);
    }
}