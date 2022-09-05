package leetcode75.first;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DecodeStringTest {

    DecodeString decodeString = new DecodeString();

    @ParameterizedTest
    @CsvSource({
//            "3[a]2[bc],aaabcbc",
            "3[a2[c]],accaccacc"
    })
    void decodeString(String s, String expected) {
        String actual = decodeString.decodeString(s);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}