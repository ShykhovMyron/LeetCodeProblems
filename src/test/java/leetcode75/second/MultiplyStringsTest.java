package leetcode75.second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MultiplyStringsTest {
    private final MultiplyStrings multiplyStrings = new MultiplyStrings();

    @ParameterizedTest
    @CsvSource({
            "123,456,56088",
    })
    void multiply(String num1, String num2, String expected) {
        String actual = multiplyStrings.multiply(num1, num2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}