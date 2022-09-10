package leetcode75.first;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class TopKFrequentWordsTest {

    private final TopKFrequentWords topKFrequentWords = new TopKFrequentWords();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2, List.of("i", "love"))
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void topKFrequent(String[] words, int k, List<String> expected) {
        List<String> actual = topKFrequentWords.topKFrequent(words, k);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}