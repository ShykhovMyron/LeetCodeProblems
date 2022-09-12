package daily._2022_9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TheNumberWeakCharactersGameTest {

    final TheNumberWeakCharactersGame charactersGame = new TheNumberWeakCharactersGame();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{4, 6}, {5, 5}, {1, 5}, {10, 4}, {4, 3}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void numberOfWeakCharactersTest(int[][] properties, int expected) {
        int actual = charactersGame.numberOfWeakCharacters(properties);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}