package leetcode75.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {
    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void climbStairs() {
        int actual = climbingStairs.climbStairs(6);
        assertEquals(13, actual);
    }
}