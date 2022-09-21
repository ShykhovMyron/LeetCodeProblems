package daily._2022_9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BagTokensTest {


    final BagTokens bagTokens = new BagTokens();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{100, 200}, 150, 1),
                Arguments.of(new int[]{100, 200, 300, 400}, 200, 2),
                Arguments.of(new int[]{87, 24, 32}, 87, 2),
                Arguments.of(new int[]{71, 55, 82}, 54, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void bagOfTokensScore(int[] tokens, int power, int expected) {
        int actual = bagTokens.bagOfTokensScore(tokens, power);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}