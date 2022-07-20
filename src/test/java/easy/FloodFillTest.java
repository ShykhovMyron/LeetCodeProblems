package easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FloodFillTest {
    //[[1,1,1],[1,1,0],[1,0,1]]
//1
//1
//2
    @Test
    void floodFill() {
        FloodFill floodFill = new FloodFill();
        int[][] actual = floodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, actual);
    }
}