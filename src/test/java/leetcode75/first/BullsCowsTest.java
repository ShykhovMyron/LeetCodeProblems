package leetcode75.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BullsCowsTest {

    @Test
    void getHint() {
        String actual = new BullsCows().getHint("11", "10");
        assertEquals("1A0B", actual);
    }
}