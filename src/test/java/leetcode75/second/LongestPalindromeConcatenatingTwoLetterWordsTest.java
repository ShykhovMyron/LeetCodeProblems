package leetcode75.second;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromeConcatenatingTwoLetterWordsTest {
  private final LongestPalindromeConcatenatingTwoLetterWords letterWords =
      new LongestPalindromeConcatenatingTwoLetterWords();

  static Stream<Arguments> generateData() {
    return Stream.of(
        Arguments.of(
            22,
            new String[] {
              "dd", "aa", "bb", "dd", "aa", "dd", "bb", "dd", "aa", "cc", "bb", "cc", "dd", "cc"
            }),
        Arguments.of(8, new String[] {"ab", "ty", "yt", "lc", "cl", "ab"}),
        Arguments.of(2, new String[] {"cc", "ll", "xx"}));
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void longestPalindromeTest(int expected, String[] words) {
    int actual = letterWords.longestPalindrome(words);
    assertThat(actual).isEqualTo(expected);
  }
}
