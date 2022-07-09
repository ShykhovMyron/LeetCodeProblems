package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @CsvSource({
            "([)],false",
            "(),true",
            "(){}[],true",
            "(},false",
    })
    void isValidTest(String s, boolean expected) {
        boolean actual = validParentheses.isValid(s);
        assertEquals(expected, actual);
    }
}