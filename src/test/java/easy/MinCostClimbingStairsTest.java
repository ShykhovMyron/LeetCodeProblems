package easy;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest {
    private final MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{10, 15, 20}, 15),
                Arguments.of(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void minCostClimbingStairs(int[] nums, int expected) {
        int actual = minCostClimbingStairs.minCostClimbingStairs(nums);
        assertEquals(expected, actual);
    }
}