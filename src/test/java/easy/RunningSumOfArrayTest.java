package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOfArrayTest {

    private final RunningSumOfArray runningSumOfArray = new RunningSumOfArray();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void runningSum(int[] nums, int[] expected) {
        int[] actual = runningSumOfArray.runningSum(nums);
        assertArrayEquals(expected, actual);
    }
}