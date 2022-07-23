package easy;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LastStoneWeightTest {

    private final LastStoneWeight lastStoneWeight = new LastStoneWeight();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 4, 1, 8, 5, 2, 2, 1, 4, 1}, 1),
                Arguments.of(new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void lastStoneWeight(int[] stones, int expected) {
        int actual = lastStoneWeight.lastStoneWeight(stones);
        assertEquals(expected, actual);
    }
}