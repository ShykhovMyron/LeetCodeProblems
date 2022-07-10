package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsomorphicStringsTest {

    private final IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

    @ParameterizedTest
    @CsvSource({
            "'foo','bar',false",
    })
    void isIsomorphic(String s, String t, boolean expected) {
        boolean actual = isomorphicStrings.isIsomorphic(s, t);
        assertEquals(expected, actual);
    }
}