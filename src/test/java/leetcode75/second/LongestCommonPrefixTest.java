package leetcode75.second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("a", new String[]{"ab", "a"})
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void longestCommonPrefixTest(String expected, String[] strs) {
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}