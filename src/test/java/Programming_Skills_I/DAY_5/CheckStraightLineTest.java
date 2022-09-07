package Programming_Skills_I.DAY_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CheckStraightLineTest {
    final CheckStraightLine checkStraightLine = new CheckStraightLine();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 1}, {-6, -17}, {3, 10}, {-7, -20}, {1, 4}, {4, 13}, {9, 28}, {7, 22}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void averageTest(int[][] coordinates, boolean expected) {
        boolean actual = checkStraightLine.checkStraightLine(coordinates);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}